package bjut.controller;
import bjut.pojo.Register;
import bjut.service.RegisterService;
import bjut.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @GetMapping("/selectAll")
    public Result selectAll(){

        return Result.success(registerService.selectAll());

    }
    @GetMapping("/selectByName/{name}")
    public Result selectByName( @PathVariable("name") String name){

        return Result.success(registerService.selectByName(name));

    }
    @PostMapping("/insert")
    public Result insert( @RequestBody Register register){
        System.out.println(register);
        return Result.success(registerService.insert(register));

    }
    @GetMapping("/see/{name}")
    public Result see( @PathVariable("name")String name){
         return  Result.success(registerService.sle(name));
    }
    @PostMapping("/pay/{money}")
    public Result pay( @RequestBody Register register , @PathVariable("money") String money){
        Integer mon=Integer.valueOf(money);
        boolean pay = registerService.pay(register, mon);
        if(pay){
            return Result.success("缴费成功");

        }
      else
        return Result.fail("缴费失败");
    }

}
