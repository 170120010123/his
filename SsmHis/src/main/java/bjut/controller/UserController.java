package bjut.controller;
import bjut.pojo.Token;
import bjut.pojo.User;
import bjut.service.UserSerivce;
import bjut.utils.Result;
import bjut.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RequestMapping("/index")
@Controller
@ResponseBody
public class UserController {
    @Autowired
   private   UserSerivce userSerivce;

    @RequestMapping(value = "/login",method = {RequestMethod.POST})

    public Result login(String username, String password ) {

        if (userSerivce.login(username, password)) {
            Token token = new Token();
            token.setToken(TokenUtils.sign(username));
            return Result.success(token);
        }
        else {
            return Result.fail("登录失败");
        }
    }





}