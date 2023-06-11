package com.crud.CRUD.java.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;

}
