package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM user WHERE user_name=?1", nativeQuery = true)
    User findByName(String userName);

}
