package bjut.controller;

import bjut.pojo.Doctor;
import bjut.service.DoctorService;
import bjut.utils.Result;
import com.github.pagehelper.PageInfo;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping("/selectAll")
public Result selectAll(Integer currentPage ,Integer pageSize){
        System.out.println(currentPage+" "+pageSize);
        PageInfo<Doctor> page = doctorService.selectAll(currentPage,pageSize);
        return Result.success(page);




    }
    @GetMapping("/selectByTwo")
    public Result selectByTwo(  String doname, String department){
        return Result.success(doctorService.selectByTwo(doname,department));
    } @GetMapping("/selectByTime")
    public Result selectByTime(String doname,  String btime, String etime,String department){


        return Result.success(doctorService.selectByTime(doname,btime,etime,department));
    }
    @GetMapping("/selectByDp/{department}")
    public Result selectByDp(@PathVariable("department") String department){


        return Result.success(doctorService.selectByDp(department));
    }
}
