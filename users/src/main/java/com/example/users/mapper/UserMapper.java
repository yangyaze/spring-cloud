package com.example.users.mapper;

import com.example.users.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User>findAll();
}
