package bjut.mapper;

import bjut.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentMapper {
    List<Department> select();
    Department selectByName(String dpname);

}
