package com.crud.CRUD.java.service;

import com.crud.CRUD.java.connection.PersonConnect;
import com.crud.CRUD.java.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonIpl implements PersonService {
    @Autowired
    private PersonConnect personConnect;

    @Override
    public Person newPerson(Person person) {
        return personConnect.save(person);
    }

    @Override
    public Iterable<Person> getAllPerson() {
        return this.personConnect.findAll();
    }

    @Override
    public Person modifyPerson(Person person) {
        return null;
    }

    @Override
    public Person deletePerson(long id) {
       this.personConnect.deleteById(id );
        return null;
    }
}

