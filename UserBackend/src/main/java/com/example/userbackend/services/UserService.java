package com.example.userbackend.services;

import com.example.userbackend.entities.User;

import java.util.List;

public  interface UserService {
    User addUser(User user);
    User updateUser(User user);
    String deleteById(Long idUser);
    List<User> getAll();
    User getByUser(Long idUser);

    List<User> getUsersByEdad(Integer edadUser);
}
