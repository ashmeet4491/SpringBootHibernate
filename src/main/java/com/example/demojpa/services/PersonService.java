package com.example.demojpa.services;

import com.example.demojpa.exceptions.PersonNotFoundException;
import com.example.demojpa.models.Person;
import com.example.demojpa.repositories.PersonRepository;
import com.example.demojpa.request.CreatePersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void createPerson(CreatePersonRequest personRequest){

        Person person=personRequest.to();

        Person personFromDB=personRepository.save(person);



    }

    public  Person getPerson(int id) throws PersonNotFoundException {
        Person person=personRepository.findById(id).orElseThrow(()->new PersonNotFoundException("Person not found"));
        return person;

    }

    public List<Person> getAllPerson() {
      return  personRepository.findAll();
    }

  /*  public List<Person> deletePerson(int id) {
        return null;
    }

    public List<Person> getPersonById(int id){
          return null;
    }*/
}
