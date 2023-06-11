package com.crud.CRUD.java.connection;

import com.crud.CRUD.java.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonConnect extends JpaRepository<Person, Long>{

}
