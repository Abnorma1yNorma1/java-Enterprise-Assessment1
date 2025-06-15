package by.it_academy.jd2.Mk_jd2_111_25.dto;

import java.util.Objects;

public class Song {

    private final String name;

    public Song (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
