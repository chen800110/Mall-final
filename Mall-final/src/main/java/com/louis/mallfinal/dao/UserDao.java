package com.louis.mallfinal.dao;

import com.louis.mallfinal.dto.UserRegisterRequest;
import com.louis.mallfinal.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}