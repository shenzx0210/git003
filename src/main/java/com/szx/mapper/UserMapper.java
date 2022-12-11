package com.szx.mapper;

import com.szx.entity.User;

import java.util.List;

public interface UserMapper {

    void add(User user);

    void delete(int id);

    void update(User user);

    List<User> queryAll();

}
