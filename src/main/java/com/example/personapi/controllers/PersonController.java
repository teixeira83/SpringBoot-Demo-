package com.example.personapi.controllers;

import com.example.personapi.dto.MessageResponseDTO;
import com.example.personapi.entities.Person;
import com.example.personapi.repositories.PersonRepository;

import com.example.personapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }


//    @GetMapping("/{id}")
//    public Person getPerson(Long id) {
//        Person reciviedPerson = personRepository.getById(id);
//        return reciviedPerson;
//    }


}
