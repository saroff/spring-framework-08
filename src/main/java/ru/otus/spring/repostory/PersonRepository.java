package ru.otus.spring.repostory;

import ru.otus.spring.domain.Person;

import java.util.List;

public interface PersonRepository {

    //void insert(Person p);

    Person getById(int id);

    //Person getFirst();

    //List<Person> getAll();

    //List<Person> getByName(String name);
}
