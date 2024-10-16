package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.UserRegisterRequest;
import com.louis.mallfinal.model.User;
import com.louis.mallfinal.model.UserLoginRequest;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}