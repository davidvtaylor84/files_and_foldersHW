package com.codeclan.filesandfolders.filesandfolders.controllers;

import com.codeclan.filesandfolders.filesandfolders.models.Person;
import com.codeclan.filesandfolders.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/people")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/people/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/people")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
