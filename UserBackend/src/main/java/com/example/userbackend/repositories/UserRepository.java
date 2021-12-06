package com.example.userbackend.repositories;

import com.example.userbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Métodos personalizados
    @Query("SELECT u FROM User u WHERE u.edad =:edad")
    List<User> getUserByEdad(@Param("edad") Integer edad);
}
