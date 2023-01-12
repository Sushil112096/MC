package com.example.USERSERVICE.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_SERVICE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String userid;
    private String name;
    private String email;
    private String about;
}
