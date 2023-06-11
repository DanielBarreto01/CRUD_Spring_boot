package com.crud.CRUD.java.service;

import com.crud.CRUD.java.connection.PersonConnect;
import com.crud.CRUD.java.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
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
        Optional<Person> personOptional = this.personConnect.findById(person.getId());
        if (personOptional.get()!=null){
            personOptional.get().setName(person.getName());
            personOptional.get().setEmail(person.getEmail());
            personOptional.get().setPassword(person.getPassword());
            return this.newPerson(personOptional.get());
        }
        return null;
    }

    @Override
    public boolean deletePerson(long id) {
       this.personConnect.deleteById(id );
        return true;
    }
}

