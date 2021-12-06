package com.example.userbackend.controllers;

import com.example.userbackend.entities.User;
import com.example.userbackend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Comparator;
import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Añadir un usuario
    @PostMapping("/users/create")
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
        User newUser  = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    //Modificar Usuario
    @PutMapping("/users/update")
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
        User newUser  = userService.updateUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }


    //Eliminar Usuario
    @DeleteMapping("/users/delete/{id}")
    public ResponseEntity<String> deleteUser(@Valid @PathVariable("id") Long idUser){
        String message  = userService.deleteById(idUser);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    //Listar Usuarios
    @GetMapping("/users/get-all")
    public ResponseEntity<List<User>> updateUser(){
        List<User> users  = userService.getAll();
        users.sort(Comparator.comparing(User::getId)); //Ordenamos la lista [OPCIONAL]
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //Buscar un usuario por Id
    @GetMapping("/users/get-user-by-id/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long idUser){
        User user  = userService.getByUser(idUser);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //Recuperar usuario por edad
    @GetMapping("/users/get-users-by-edad/{edad}")
    public ResponseEntity<List<User>> getUsersByEdad(@PathVariable("edad") Integer edadUser){
        List<User> users = userService.getUsersByEdad(edadUser);
        users.sort(Comparator.comparing(User::getId)); //Ordenamos la lista [OPCIONAL]
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


}
