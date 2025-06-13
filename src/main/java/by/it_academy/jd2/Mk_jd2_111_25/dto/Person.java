package by.it_academy.jd2.Mk_jd2_111_25.dto;


public class Person {

    private  String mail;
    private final Playlist playlist = new Playlist();

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}

