package kr.hs.dgsw.shoppingmall_back.Controller;

import kr.hs.dgsw.shoppingmall_back.Domain.User;
import kr.hs.dgsw.shoppingmall_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/list")
    public List<User> select(){
        return this.userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User select(@PathVariable Long id){
        return this.userService.findById(id);
    }

    @DeleteMapping("/user/delete/{id}")
    public int delete(@PathVariable Long id){
        return this.userService.deleteById(id);
    }

    @PostMapping("/user/add")
    public Long insert(@RequestBody User user){
        return this.userService.add(user);
    }

    @PostMapping("/user/addHash")
    public int insertHash(@RequestBody User user){
        return this.userService.addWithHashmap(user);
    }

    @PutMapping("user/update")
    public int update(@RequestBody User user){
        return this.userService.modify(user);
    }
}
