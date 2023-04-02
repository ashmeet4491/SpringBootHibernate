package com.example.demojpa.controllers;

import com.example.demojpa.exceptions.PersonNotFoundException;
import com.example.demojpa.models.Person;
import com.example.demojpa.request.CreatePersonRequest;
import com.example.demojpa.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    private  static Logger logger= LoggerFactory.getLogger(PersonController.class);
    @PostMapping("/person")
    public void  CreatePerson(@RequestBody @Valid CreatePersonRequest personRequest)
    {
        //validations and exception Handling we have outsourced.
        //invoking service classes function
        personService.createPerson(personRequest);



        //   return  new ResponseEntity<>(new Person(), HttpStatus.CREATED);
    }

  /*  @GetMapping
    public void getPerson(@RequestParam("id") int id)
    {
    }*/

    @GetMapping("/allPerson")
    public List<Person> getAllPerson()
    {
        return personService.getAllPerson();
    }

    @GetMapping("/Person")
    public List<Person> getPersonById(@RequestParam("id") int id) throws PersonNotFoundException {
        return (List<Person>) personService.getPerson(id);
    }




   /* @DeleteMapping("/person/{id}")
    public List<Person> deletePersonId(@PathVariable("id") int id) {
        return personService.deletePerson(id);

    }*/
    //Exception handler



    public static void main(String[] args)
    {



       /* Person p=new Person();
        p.setAge(10);
        p.setId(1);
        p.setFirstname("Ashmeet");
        p.setLastname("Kaur");*/

       /*builder return the person builder object.This builder
        is easier to design*/
        //    Person person=new Person();
        Person.PersonBuilder personBuilder=Person.builder();
        personBuilder.age(10).firstname("ABC").lastName("xyz").id(1);

        Person person=setFn(personBuilder);



    }
    public static  Person setFn(Person.PersonBuilder personBuilder)
    {
        int age=10;
        return personBuilder.age(age).build();
    }


}
