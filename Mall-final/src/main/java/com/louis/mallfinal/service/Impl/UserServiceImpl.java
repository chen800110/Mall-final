package com.louis.mallfinal.service.Impl;


import com.louis.mallfinal.dao.UserDao;
import com.louis.mallfinal.dto.UserRegisterRequest;
import com.louis.mallfinal.model.User;
import com.louis.mallfinal.service.UserService;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        User user=userDao.getUserByEmail(userRegisterRequest.getEmail());
    //檢查註冊email
        if(user!=null){
            log.warn("該Email{}已經被註冊",userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    //創建帳號
        return userDao.createUser(userRegisterRequest);
    }


}
