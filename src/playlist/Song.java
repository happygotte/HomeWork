package playlist;

import java.util.Arrays;
import java.util.Objects;

public class Song {

    private String singer;
    private String name;
    private String[] genres;
    private String[] moods;
    private String duration;

    public Song(String singer, String name, String[] genres, String[] moods, String duration) {
        this.singer = singer;
        this.name = name;
        this.genres = genres;
        this.moods = moods;
        this.duration = duration;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String[] getMoods() {
        return moods;
    }

    public void setMoods(String[] moods) {
        this.moods = moods;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(singer, name, Arrays.hashCode(genres), Arrays.hashCode(moods), duration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(singer, song.singer) &&
                Objects.equals(name, song.name) &&
                genres == song.genres &&
                moods == song.moods &&
                Objects.equals(duration, song.duration);

    }

    @Override
    public String toString() {
        return  singer + " - " +
                name + " - " +
                Arrays.toString(genres) + " - " +
                Arrays.toString(moods) + " - " +
                duration +
                '\n';
    }
}
