package bjut.service;

import bjut.pojo.Doctor;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;



public interface DoctorService {

    PageInfo<Doctor> selectAll( Integer currentPage,Integer pageSize);
  List<Doctor>selectByTwo(String doname,String departmentid);
List<Doctor>selectByTime(String doname, String btime, String etime ,String department);
    List<Doctor>selectByDp(String department);
}
