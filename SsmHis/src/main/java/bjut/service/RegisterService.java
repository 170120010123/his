package bjut.service;

import bjut.pojo.Register;

import java.util.List;
import java.util.Map;

public interface RegisterService {
    List<Register> selectAll();
  boolean  insert(Register register);
  boolean pay (Register register,Integer money);
    List<Register> selectByName(String name);
    List<Map<String,Integer>>  sle(String name);


}
