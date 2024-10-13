package com.louis.mallfinal.dao;

import com.louis.mallfinal.dto.UserRegisterRequest;
import com.louis.mallfinal.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}