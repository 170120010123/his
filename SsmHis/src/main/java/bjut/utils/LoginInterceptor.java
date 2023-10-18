package bjut.utils;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        if(request.getMethod().equals("OPTIONS")){
            return true;
        }
        String token = request.getHeader("token");
        System.out.println("拦截器启动");
        System.out.println(token);
        if (!StringUtils.isEmpty(token)) {
            String username = TokenUtils.getUsername(token);
            if (TokenUtils.verify(token, username)) {
                return true; } }
        Result result=Result.fail("token不正确，请登录");
        result.setCode("5555");
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(JSON.toJSONString(result));
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
