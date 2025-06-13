package by.it_academy.jd2.Mk_jd2_111_25.storage.api;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Person;
import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;

import java.util.List;

public interface IPersonStorage {

    void add (Person person);

    List<Person> getAll ();

    void delete (Person person);
}
