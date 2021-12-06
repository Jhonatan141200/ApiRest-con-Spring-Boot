package com.example.userbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "Ingrese un nombre válido")
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @NotNull
    @Size(min = 1, max = 50, message = "Ingrese un apellido válido")
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastName;

    @NotNull
    @Column(name = "edad", nullable = false)
    private Integer edad;

    @NotNull
    @Column(name = "sexo", nullable = false)
    private Character sexo;

    @Email(message = "Ingrese un email válido")
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Size(min = 8, max = 20)
    @Column(name = "password", nullable = false, length = 20)
    private String password;

}
