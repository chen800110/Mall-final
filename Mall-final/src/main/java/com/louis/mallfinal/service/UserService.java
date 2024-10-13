package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.UserRegisterRequest;
import com.louis.mallfinal.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);

}