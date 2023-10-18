package bjut.service;

import bjut.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserSerivce {

   boolean  login(String username, String password);
   List<User> selectAll();
 User selectByName1(String username);
boolean update(User user);
boolean insert(User user );
    boolean update1(User user);
    User selectpic(String username);
}
