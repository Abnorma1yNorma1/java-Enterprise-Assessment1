package by.it_academy.jd2.Mk_jd2_111_25.service.api;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;

import java.util.List;

public interface IPlaylistService {

    void addMail (String mail);
    void addSong (String mail, Song song);
    void deleteSong (String mail, String songName);
    List<Song> getPlaylist (String mail);

}
