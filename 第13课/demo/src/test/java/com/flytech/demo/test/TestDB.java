package com.flytech.demo.test;

import com.flytech.demo.Application;
import com.flytech.demo.entity.User;
import com.flytech.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDB {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User user = new User();
        user.setName("flytech");
        user.setAge(10);
        try {
            userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
