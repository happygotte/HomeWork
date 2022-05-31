package playlist;

import playlist.predicates.FilterByGenre;
import playlist.predicates.FilterByMood;
import playlist.suppliers.ListOfSongsFromFile;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainSong {
    public static void main(String[] args) {

        Supplier<List<Song>> supplier = new ListOfSongsFromFile("songs.txt");
        List<Song> songs = supplier.get();


        Predicate<Song> filterByGenre = new FilterByGenre("рок");

        List<Song> filtered1 = new ArrayList<>();

        for (Song item : songs) {
            if(filterByGenre.test(item)){
                filtered1.add(item);
            }
        }

        Predicate<Song> filterByMood = new FilterByMood("весёлая");

        List<Song> filtered2 = new ArrayList<>();

        for (Song item : filtered1) {
            if(filterByMood.test(item)){
                filtered2.add(item);
            }
        }

        Playlist playlist = new Playlist();

        List<Song> mySongs = new ArrayList<>(filtered2);
        playlist.setSongs(mySongs);

        playlist.setName("Весёлый рок" + "\n");
        playlist.setDescribe("Всякие классные песенки" + "\n");

        WorkWithFiles workWithFiles = new WorkWithFiles();
        workWithFiles.writePlaylist("C:/Users/Maria/IdeaProjects/JD1", playlist);

    }
}
