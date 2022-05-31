package playlist.predicates;

import playlist.Song;

import java.util.Objects;
import java.util.function.Predicate;

public class FilterByMood implements Predicate<Song> {

    private final String mood;

    public FilterByMood(String mood) {
        this.mood = mood;
    }

    @Override
    public boolean test(Song song) {
        for (String songMood : song.getMoods()) {
            if (Objects.equals(songMood, mood)){
                return true;
            }
        }
        return false;
    }
}
