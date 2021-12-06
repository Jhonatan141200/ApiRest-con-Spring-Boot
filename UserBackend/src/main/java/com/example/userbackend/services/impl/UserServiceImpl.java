package com.example.userbackend.services.impl;

import com.example.userbackend.entities.User;
import com.example.userbackend.repositories.UserRepository;
import com.example.userbackend.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        if(userRepository.existsById(user.getId())){
            return userRepository.save(user);
        }else{
            return new User();
        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getByUser(Long idUser) {
        return userRepository.findById(idUser).orElseGet(User::new);
    }

    @Override
    public List<User> getUsersByEdad(Integer edadUser) {
        return userRepository.getUserByEdad(edadUser);
    }

    @Override
    public String deleteById(Long idUser){
        try {
            userRepository.deleteById(idUser);
            return "Eliminación exitosa";
        }catch (Exception e){
            return "No se pudo eliminar";
        }

    }

}
