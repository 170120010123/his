package bjut.service;

import bjut.pojo.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> select();
    Department selectByName(String dpname);

}
