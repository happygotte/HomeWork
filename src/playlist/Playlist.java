package playlist;

import java.util.List;

public class Playlist {

    private String nameList;
    private String describe;
    List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return nameList;
    }

    public void setName(String name) {
        this.nameList = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * Добавление песни в список песен
     * @param song песня
     */
    public void add(Song song) {
        this.songs.add(song);
    }
}


