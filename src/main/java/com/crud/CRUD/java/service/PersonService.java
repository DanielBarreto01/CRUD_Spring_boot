package com.crud.CRUD.java.service;
import com.crud.CRUD.java.model.*;

public interface PersonService {

    Person newPerson(Person person);
    Iterable<Person> getAllPerson();
    Person modifyPerson(Person person);
    Person deletePerson(long id);

}
