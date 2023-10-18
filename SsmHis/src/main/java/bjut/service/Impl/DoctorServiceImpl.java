package bjut.service.Impl;

import bjut.mapper.DoctorMapper;
import bjut.pojo.Doctor;
import bjut.service.DoctorService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DoctorServiceImpl  implements DoctorService {
@Autowired
    DoctorMapper doctorMapper;
//第几页，每页几条
    @Override
    public PageInfo<Doctor> selectAll(Integer currentPage,Integer pageSize  ) {

        PageHelper.startPage(currentPage,pageSize);

        List<Doctor> doctors = doctorMapper.selectAll();
        //获取分页相关信息
        PageInfo<Doctor> pageInfo = new PageInfo<>(doctors, pageSize);
        return pageInfo;






    }

    @Override
    public List<Doctor> selectByTwo(String doname, String departmentid) {

        return doctorMapper.selectByTwo(doname,departmentid);

    }

    @Override
    public List<Doctor> selectByTime(String doname, String btime, String etime,String department) {
        List<Doctor> doctors = doctorMapper.selectByTime(doname,btime,etime,department);
        return doctors;
    }

    @Override
    public List<Doctor> selectByDp(String department) {
        List<Doctor> doctors = doctorMapper.selectByDp(department);
        return doctors;

    }


}
