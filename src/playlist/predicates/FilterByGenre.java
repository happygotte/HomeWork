package playlist.predicates;

import playlist.Song;

import java.util.Objects;
import java.util.function.Predicate;

public class FilterByGenre implements Predicate<Song> {

    private final String genre;

    public FilterByGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean test(Song song) {
        for (String songGenre : song.getGenres()) {
            if (Objects.equals(songGenre, genre)){
                return true;
            }
        }
        return false;
    }
}
