package com.crud.CRUD.java.controller;


import com.crud.CRUD.java.model.Person;
import com.crud.CRUD.java.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/personas")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/nueva")
    public Person newPerson(@RequestBody Person person){
        return this.personService.newPerson(person);

    }
    @GetMapping("/todas")
    public Iterable<Person> getAllPerson(){
        return this.personService.getAllPerson();

    }
    @PostMapping("/update")
    public Person modifyPerson(@RequestBody Person person){
        return this.personService.modifyPerson(person);
    }
    @GetMapping(value="/{id}")
    public boolean deletePerson(@PathVariable(value= "id")long id){

        return this.personService.deletePerson(id);
    }

}

