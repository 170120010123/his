package bjut.mapper;

import bjut.pojo.Register;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RegisterMapper {
List<Register> selectAll();
int insert(Register register);
int  pay(Register register);
List<Register> selectByName(String name);
    List<Register> selectByTwo(@Param("name") String name,@Param("department")String department);
    @MapKey("department")
    List<Map<String,Integer>> smap(String name);
}
