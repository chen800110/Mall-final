package com.louis.mallfinal.service.Impl;


import com.louis.mallfinal.dao.UserDao;
import com.louis.mallfinal.dto.UserRegisterRequest;
import com.louis.mallfinal.model.User;
import com.louis.mallfinal.model.UserLoginRequest;
import com.louis.mallfinal.service.UserService;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
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

        // 生成密碼的雜湊
        String hashedpassword= DigestUtils.md5DigestAsHex(userRegisterRequest.getPassword().getBytes());
        userRegisterRequest.setPassword(hashedpassword);

    //創建帳號  
        return userDao.createUser(userRegisterRequest);
    }


    @Override
    public User login(UserLoginRequest userLoginRequest) {
        User user=userDao.getUserByEmail(userLoginRequest.getEmail());


        //檢查user是否存在
        if(user==null){
            log.warn("該Email{}尚未申請",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //使用md5生成密碼的雜湊

        String hashedpassword= DigestUtils.md5DigestAsHex(userLoginRequest.getPassword().getBytes());
        //比較密碼
        if(user.getPassword().equals(hashedpassword)){
            return user;
        }else {
            log.warn("Email{}密碼錯誤",userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
