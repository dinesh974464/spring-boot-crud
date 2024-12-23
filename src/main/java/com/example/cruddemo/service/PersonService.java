package com.example.cruddemo.service;

import com.example.cruddemo.model.Person;
import com.example.cruddemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    // Create or update person
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    // Get all persons
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // Get person by id
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    // Delete person by id
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
