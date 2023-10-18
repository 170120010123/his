package bjut.mapper;
import bjut.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserMapper {
List<User> login(@Param("username") String username, @Param("password") String password);
List<User> selectAll();
User selectByName1(String username);
int update(User user);
int insert(User user) ;
    int update1(User user);
    User  selectpic(String username);
}
