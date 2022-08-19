package com.uniqueusernameannotation.uniqueusernameannotation.model;

import com.uniqueusernameannotation.uniqueusernameannotation.annotations.UniqueUsername;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;

@Document
public class User {

    @Id
    private String id;

    private String name;

    @UniqueUsername(message = "Username already exists.")
    private String username;

    @Email
    private String email;


    private String password;

}
