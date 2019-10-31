package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * Description:
 * Auther:cherry
 * CreateTime:2019-10-31 09:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    /**
     * 调试数据库连接
     */
    @Test
    public void test(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        System.out.println("formattedDate:"+formattedDate);

        userRepository.save(new User("张三", "aa123456", "aa@123.com", "aa1",formattedDate));
        userRepository.save(new User("李四", "bb123456", "bb@123.com", "bb1",formattedDate));
        userRepository.save(new User("王五", "cc123456", "cc@123.com", "cc1",formattedDate));

//        Assert.assertEquals(9, userRepository.findAll().size());

        Assert.assertEquals("aa1", userRepository.findByUserNameOrEmail("张三", "aa@123.com").getNickName());

        userRepository.delete(userRepository.findByUserName("李四"));

    }





}
