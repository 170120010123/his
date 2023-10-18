package bjut.service.Impl;
import bjut.mapper.RegisterMapper;
import bjut.mapper.UserMapper;
import bjut.pojo.Register;
import bjut.pojo.User;
import bjut.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterMapper registerMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public List<Register> selectAll() {
        return registerMapper.selectAll();
    }

    @Override
    public boolean insert(Register register) {

        int insert = registerMapper.insert(register);
        if (insert > 0) {

            return true;
        }


        return false;
    }

    @Override
    public boolean pay(Register register, Integer money) {

        String name = register.getName();
        User user = userMapper.selectByName1(name);
        if (user.getMoney() > money) {
            user.setMoney(user.getMoney() - money);
            register.setState(1);
            int count = userMapper.update(user);
            count = count + registerMapper.pay(register);
            System.out.println(count);
            if (count == 2) {
                return true;
            }

        }
        return false;
    }

    @Override
    public List<Register> selectByName(String name) {
        return registerMapper.selectByName(name);
    }

    @Override
    public List<Map<String, Integer>>sle(String name) {


        List<Map<String, Integer>>  smap = registerMapper.smap(name);
        return smap;

 }
}