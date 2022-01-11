package com.nelolik.springcourse.service;

import com.nelolik.springcourse.dao.PersonDAO;
import com.nelolik.springcourse.model.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBService {

    private PersonDAO personDAO;

    public DBService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<Person> index() {
        return personDAO.index();
    }

    public Person show(int id) {
        return personDAO.show(id);
    }

    public void save(Person person) {
        personDAO.save(person);
    }

    public void update(int id, Person person) {
        personDAO.update(id, person);
    }

    public void delete(int id) {
        personDAO.delete(id);
    }

}
