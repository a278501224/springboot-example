package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description:Dao
 * Auther:cherry
 * CreateTime:2019-10-30 14:32
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);

}
