package by.it_academy.jd2.Mk_jd2_111_25.storage;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;
import by.it_academy.jd2.Mk_jd2_111_25.storage.api.IPlaylistStorage;

import java.time.Period;
import java.util.*;

public class PlaylistStorageRam implements IPlaylistStorage {

private final Map<String, ArrayList<Song>> persons = new HashMap<>();


    @Override
    public void addList(String mail) {
        persons.put(mail, new ArrayList<>());
    }

    @Override
    public void addSong(String mail, Song song) {
        persons.get(mail).add(song);
    }

    @Override
    public List<Song> getList(String mail) {
        return persons.get(mail);
    }

    @Override
    public void deleteSong(String mail, Song song) {
        persons.get(mail).remove(song);
    }

    @Override
    public Set<String> getAllMail() {
        return persons.keySet();
    }
}
