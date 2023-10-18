package bjut.service.Impl;

import bjut.mapper.DepartmentMapper;
import bjut.pojo.Department;
import bjut.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
@Autowired
    DepartmentMapper departmentMapper;

    @Override
    public  List<Department>select() {
        return  departmentMapper.select();
    }

    @Override
    public Department selectByName(String dpname) {
        return  departmentMapper.selectByName(dpname);
    }
}
