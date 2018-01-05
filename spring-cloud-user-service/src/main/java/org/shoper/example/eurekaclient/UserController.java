package org.shoper.example.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ShawnShoper on 2017/6/27.
 */

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") String id){
        User user = new User();
        user.setId(id);
        user.setAddress("cheng du");
        user.setName("passwd");
        return user;
    }
}
