package by.it_academy.jd2.Mk_jd2_111_25.storage.api;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;

import java.util.List;
import java.util.Set;

public interface IPlaylistStorage {

    void addList (String mail);
    void addSong (String mail, Song song);

    List<Song> getList(String mail);

    void deleteSong (String mail, Song song);
    Set<String> getAllMail ();
}
