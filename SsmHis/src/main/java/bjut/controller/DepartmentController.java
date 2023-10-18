package bjut.controller;

import bjut.service.DepartmentService;
import bjut.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/select")
    public Result select(){
        return Result.success(departmentService.select());
    }
    @GetMapping("/selectByName/{dpname}")
    public Result selectByName(@PathVariable("dpname") String dpname){
        return Result.success(departmentService.selectByName(dpname));
    }




}
