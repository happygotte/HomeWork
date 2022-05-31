package playlist.suppliers;

import playlist.Song;
import playlist.WorkWithFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Поставщик списка песен из стороннего файла
 */
public class ListOfSongsFromFile implements Supplier<List<Song>> {

    private final String path;

    public ListOfSongsFromFile(String path) {
        this.path = path;
    }

    @Override
    public List<Song> get() {
        List<Song> songs = new ArrayList<>();

        WorkWithFiles workWithFiles = new WorkWithFiles();
        String s = workWithFiles.readWithBufferReader(path); // читаем файл в одну строку

        String[] array = s.split("/");                 // каждая строка в файле отделена "/"

        for (String s1 : array) {
            String[] subArray = s1.split("-");         // каждое свойство песни отделено ","
            Song song = new Song(                            // создаём объект песни и добавляем в список
                    subArray[0],
                    subArray[1],
                    subArray[2].split(","),
                    subArray[3].split(","),
                    subArray[4]
                    );
            songs.add(song);
        }
        return songs;
    }
}
