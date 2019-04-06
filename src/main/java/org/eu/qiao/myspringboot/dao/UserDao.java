package org.eu.qiao.myspringboot.dao;

import org.eu.qiao.myspringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassNamg UserDao
 * @Description todo
 * Author BOB
 * @Date 2019/4/1 20:28
 * @Version 1.0
 **/
@Repository
public interface UserDao extends JpaRepository<User, String> {

    @Query("from User u where u.username = :username and password = :password")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}

