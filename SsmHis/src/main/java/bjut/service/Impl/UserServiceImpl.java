package bjut.service.Impl;
import bjut.mapper.ProductMapper;
import bjut.mapper.UserMapper;
import bjut.pojo.Product;
import bjut.pojo.User;
import bjut.service.UserSerivce;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl  implements UserSerivce {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public boolean login(String username, String password) {
        List<User> userList = userMapper.login(username, password);
        if (userList.size() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<User> selectAll() {


        List<User> userList = userMapper.selectAll();
        return userList;


    }

    @Override
    public User selectByName1(String username) {
        User userList = userMapper.selectByName1(username);
        return userList;
    }

    @Override
    public boolean update(User user) {
        int update = userMapper.update(user);
        if (update > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean insert(User user) {


            User list = userMapper.selectByName1(user.getUsername());


            if (list!=null) {
                return false;
            } else {
                if (userMapper.insert(user) > 0) {
                    return true;

                }
                return false;
            }






    }

    @Override
    public boolean update1(User user) {
        int update = userMapper.update1(user);
        if (update > 0) {
            return true;
        }
        return false;
    }

    @Override
    public User selectpic(String username) {
      User user= userMapper.selectpic(username);

       return  user;
    }
}
