package com.sevensevengsi.Spring.Security.Activity.model;


import javax.persistence.*;

import lombok.*;


@Data
@Entity
@EqualsAndHashCode
@Getter
@Setter
@Table(name = "user_table")
public class User{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;

    private String role;

    private boolean isEnabled;

    private boolean isAccountNonLocked;

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }


}