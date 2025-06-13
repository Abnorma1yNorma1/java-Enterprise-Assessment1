package by.it_academy.jd2.Mk_jd2_111_25.service.api;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Person;
import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;

import java.util.List;

public interface IPlaylistService {

    void add (Person person, Song song);
    void delete (Person person, Song song);
    List<Song> getPlaylist (Person person);

}
