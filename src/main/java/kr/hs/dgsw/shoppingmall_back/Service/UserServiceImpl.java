package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.User;
import kr.hs.dgsw.shoppingmall_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return this.userMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return this.userMapper.deleteById(id);
    }

    @Override
    public Long add(User user) {
        return this.userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return this.userMapper.modify(user);
    }

    @Override
    public User findById(Long id) {
        return this.userMapper.findById(id);
    }

    @Override
    public int addWithHashmap(User user) {
        HashMap map = new HashMap<String, Object>();
        map.put("account", user.getAccount());
        map.put("password", user.getPassword());
        map.put("username", user.getUsername());
        map.put("email", user.getEmail());
        return this.userMapper.addWithHashmap(map);
    }
}
