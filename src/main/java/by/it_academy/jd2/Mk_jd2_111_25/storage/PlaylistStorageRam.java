package by.it_academy.jd2.Mk_jd2_111_25.storage;

import by.it_academy.jd2.Mk_jd2_111_25.dto.Song;
import by.it_academy.jd2.Mk_jd2_111_25.storage.api.IPlaylistStorage;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlaylistStorageRam implements IPlaylistStorage {

private final Map<String, CopyOnWriteArrayList<Song>> playlists = new ConcurrentHashMap<>();


    @Override
    public void addList(String mail) {
        playlists.put(mail, new CopyOnWriteArrayList<>());
    }

    @Override
    public boolean addSong(String mail, Song song) {
        if (mail == null || song == null || !playlists.containsKey(mail)){
            return false;
        } else {
            playlists.get(mail).add(song);
            return true;
        }
    }

    @Override
    public List<Song> getList(String mail) {
        if (mail == null || !playlists.containsKey(mail) ){
            return new CopyOnWriteArrayList<>();
        } else {
            return playlists.get(mail);
        }
    }

    @Override
    public boolean deleteSong(String mail, Song song) {
        if (mail == null || song == null || !playlists.containsKey(mail)){
            return false;
        } else {
            playlists.get(mail).remove(song);
            return true;
        }
    }

    @Override
    public Set<String> getAllMail() {
        return playlists.keySet();
    }
}
