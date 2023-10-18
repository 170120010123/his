import bjut.controller.DepartmentController;
import bjut.mapper.DepartmentMapper;
import bjut.mapper.DoctorMapper;
import bjut.mapper.UserMapper;
import bjut.pojo.Doctor;
import bjut.pojo.Register;
import bjut.pojo.User;
import bjut.service.DepartmentService;
import bjut.service.RegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Test1 {
    @Autowired
    RegisterService registerService;

    @Test
    public  void Testdas(){

        List<Map<String, Integer>>   s = registerService.sle("张三");
        System.out.println(s);
        for (Map<String, Integer> map : s ) {
            for (String k : map.keySet()) {
                System.out.println(k + " : " + map.get(k));
            }
        }

    }
    }