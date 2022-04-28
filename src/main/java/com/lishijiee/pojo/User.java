package com.lishijiee.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
    private int id;
    private int userId;
    private String userName;
    private int age;
    private String password;
    private String email;
}
