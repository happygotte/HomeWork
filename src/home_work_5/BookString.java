package home_work_5;

import java.io.*;

/*
Класс для чтения текстового файла и сохранения его содержимого в строку
 */
public class BookString {

    /**
     * Чтение текстового файла через BufferReader
     * @param path путь к файлу
     * @return содержимое файла в виде строки
     */
    public static String readWithBufferReader(String path) {
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
}



