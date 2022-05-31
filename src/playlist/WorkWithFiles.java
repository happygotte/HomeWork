package playlist;

import java.io.*;
import java.util.List;

public class WorkWithFiles {

    /**
     * Чтение текстового файла через BufferReader
     * @param path путь к файлу
     * @return содержимое файла в виде строки
     */
    public String readWithBufferReader(String path) {
        StringBuilder in = new StringBuilder();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                in.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении");
        }
        return in.toString();
    }

    /**
     * Запись списка песен в файл
     * @param path путь к директории, в которой должен быть создан файл
     * @param playlist список песен
     */
    public void writePlaylist(String path, Playlist playlist) {

        File file = new File(path, "\\playlist.txt");

        try (FileWriter fileWriter = new FileWriter(file, false)) {
            try {
                fileWriter.write(playlist.getName());       // добавляем название плейлиста
                fileWriter.write(playlist.getDescribe());   // добавляем описание плейлиста

                List<Song> playlistForWrite = playlist.getSongs();

                int number = 1;
                for (Song song : playlistForWrite) {        // запись данных песни в соответствии с образцом
                    fileWriter.write(number + ". " +
                            stringForWrite(song)
                    );
                    number++;
                }
                fileWriter.flush();
            } catch (IOException e) {
                System.out.println("Произошла ошибка при записи");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла");
        }
    }

    /**
     * Преобразование свойств песни в строку (для последующей записи в файл)
     * @param song Песня
     * @return строка, включающая название, певца и продолжительность песни
     */
    public String stringForWrite(Song song) {
        int duration = Integer.parseInt(song.getDuration());
        int minutes = duration / 60;
        int seconds = duration % 60;
        String newDuration = minutes + ":" + seconds;
        return song.getName() + " - " +
                song.getSinger() + " " +
                newDuration + "\n";
    }
}

