package com.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "USER", schema = "PUBLIC", catalog = "DB")
@Data
@ToString
@EqualsAndHashCode
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "SURNAME")
    private String surname;

    @Basic
    @Column(name = "LOGIN")
    private String login;

    @Basic
    @Column(name = "PASSWORD")
    private String password;
}
