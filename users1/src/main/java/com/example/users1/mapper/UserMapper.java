package com.example.users1.mapper;

import com.example.users1.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User>findAll();
}
