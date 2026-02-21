package com.Backend.Backend.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import org.springframework.data.mongodb.core.index.Indexed;
@Document(collection="users")
@Data
public class Users {
    @Id
    private String Id;
    @Indexed(unique=true)
    private String username;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String Sport;


}