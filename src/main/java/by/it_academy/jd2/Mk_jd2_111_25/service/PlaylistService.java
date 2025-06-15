package by.it_academy.jd2.Mk_jd2_111_25.service;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;
import by.it_academy.jd2.Mk_jd2_111_25.service.api.IPlaylistService;
import by.it_academy.jd2.Mk_jd2_111_25.storage.PlaylistStorageRam;
import by.it_academy.jd2.Mk_jd2_111_25.storage.api.IPlaylistStorage;

import java.util.List;

public class PlaylistService implements IPlaylistService {

    private static final IPlaylistStorage storage = new PlaylistStorageRam();

    @Override
    public void addMail(String mail) {
        if (!storage.getAllMail().contains(mail)){
            storage.addList(mail);
        }
    }

    @Override
    public boolean addSong(String mail, Song song) {
        if (!storage.getList(mail).contains(song)){
            return storage.addSong(mail, song);
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteSong(String mail, String songName) {
        List<Song> list = storage.getList(mail);
        for (Song s: list) {
            if (songName.equals(s.getName())){
                return storage.deleteSong(mail, s);
            }
        }
        return false;
    }

    @Override
    public List<Song> getPlaylist(String mail) {
        return storage.getList(mail);
    }
}
