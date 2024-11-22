package com.thourie.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="accounts")
@Setter
@Getter
@RequiredArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;

    private String password;

    private String enail;

    @OneToMany
    private List<Role> roles;


}
