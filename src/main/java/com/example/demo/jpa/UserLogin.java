package com.example.demo.jpa;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserLogin extends JpaRepository<User,Integer> {
    @Query(value = "select * from guest where username = ?1 and passward =?2",nativeQuery = true)
//    User findUserByusernameAndPassward(@Param("username") String username, @Param("passward") String passsward);
    User findUserByusernameAndPassward(String username,String passsward);
}