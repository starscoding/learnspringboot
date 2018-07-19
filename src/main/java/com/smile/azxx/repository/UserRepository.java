package com.smile.azxx.repository;

import com.smile.azxx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Smile on 2018/6/13.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String name);

    User findByUserNameOrEmail(String userName,String email);
}
