package org.eu.qiao.myspringboot.service;

import org.eu.qiao.myspringboot.dao.UserDao;
import org.eu.qiao.myspringboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassNamg UserService
 * @Description todo
 * Author BOB
 * @Date 2019/4/1 20:28
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean login(String username, String password){
        User user = userDao.findByUsernameAndPassword(username, password);
        if(null == user){
            return false;
        }else {
            return true;
        }
    }

}
