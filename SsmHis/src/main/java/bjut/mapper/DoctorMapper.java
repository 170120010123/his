package bjut.mapper;
import bjut.pojo.Doctor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DoctorMapper {
    List<Doctor> selectAll();
    List<Doctor>selectByTwo( @Param("doname") String doname,  @Param("departmentid") String departmentid);
 List<Doctor>selectByTime(@Param("doname") String doname, @Param("btime")String btime,@Param("etime") String etime,@Param("department") String department);
List<Doctor>selectByDp(String department);


}
