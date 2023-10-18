package bjut.controller;
import bjut.pojo.User;
import bjut.service.UserSerivce;
import bjut.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;
@CrossOrigin
@Controller
@ResponseBody
@RequestMapping("/user")
public class User1Controller {

@Autowired
UserSerivce userSerivce;
    @GetMapping("/selectall")
public Result selectAll(){
    List<User> userList = userSerivce.selectAll();
    return Result.success(userList);



}   @GetMapping("/selectpic/{username}")
    public Result selectpic( @PathVariable("username") String username){
        User user=userSerivce.selectpic(username);
        String filePath = "require('../assets/";String endpath="')";
        String  res=filePath+user.getProduct().getPimage()+endpath ;

        System.out.println(res);

return Result.success(res);
    }
    @GetMapping("/selectByName1/{username}")
    public Result selectByName1( @PathVariable("username") String username){
        User userList = userSerivce.selectByName1(username);
        return Result.success(userList);


    }
@PutMapping("/update1")

    public Result update1(@RequestBody User user, HttpSession session){
int i=(int)session.getAttribute("keyid");
 user.setPid(i);
    return Result.success(userSerivce.update1(user));

    }


    @PostMapping("/insert")
    public Result insert (@RequestBody User user){
if (userSerivce.insert(user)){

    return  Result.success("ok");

}
       else{

    return  Result.fail("error");
       }


    }

}
