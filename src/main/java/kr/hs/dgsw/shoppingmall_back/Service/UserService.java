package kr.hs.dgsw.shoppingmall_back.Service;

import kr.hs.dgsw.shoppingmall_back.Domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    int deleteById(Long id);
    Long add(User user);
    int modify(User user);
    User findById(Long id);
    int addWithHashmap(User user);
}
