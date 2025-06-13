package by.it_academy.jd2.Mk_jd2_111_25.service;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Person;
import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;
import by.it_academy.jd2.Mk_jd2_111_25.service.api.IPlaylistService;
import by.it_academy.jd2.Mk_jd2_111_25.storage.PersonStorageRam;
import by.it_academy.jd2.Mk_jd2_111_25.storage.api.IPersonStorage;

import java.util.Iterator;
import java.util.List;

public class PlaylistService implements IPlaylistService {

    private static final IPersonStorage storage = new PersonStorageRam();

    @Override
    public void add(Person person, Song song) {
        for (Person stored : storage.getAll()){
            if (stored.equals(person)){
                stored.getPlaylist();
            }
        }
        storage.getAll();

    }

    @Override
    public void delete(Person person, Song song) {
        storage.delete(song);
    }

    @Override
    public List<Song> getPlaylist(Person person) {
        return storage.getPlaylist();
    }
}
