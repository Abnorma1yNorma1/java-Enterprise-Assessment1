package by.it_academy.jd2.Mk_jd2_111_25.storage;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Person;
import by.it_academy.jd2.Mk_jd2_111_25.storage.api.IPersonStorage;

import java.util.ArrayList;
import java.util.List;

public class PersonStorageRam implements IPersonStorage {

private final List<Person> persons = new ArrayList<>();


    @Override
    public void add(Person person) {
        persons.add(person);
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public void delete(Person person) {

    }
}
