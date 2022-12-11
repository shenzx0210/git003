package com.szx.test;

import com.szx.entity.User;
import com.szx.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TestUserMapper {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testAdd(){
        userMapper.add(new User(7,"a",20,"a.com"));
    }

    @Test
    public void testDelete(){
        userMapper.delete(7);
    }

    @Test
    public void testUpdate(){
        userMapper.update(new User(6,"aaa",19,"aaa.com"));
    }

    @Test
    public void testQueryAll(){
        List<User> users = userMapper.queryAll();
        users.forEach(System.out::println);
    }

}
