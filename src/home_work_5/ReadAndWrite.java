package home_work_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

    /**
     * Запись в файл
     * @param string Строка, которую надо записать в файл
     * @param path Путь к файлу, в который будет производиться запись
     */
    public static void write(StringBuilder string, String path) {

        try (FileWriter fileWriter = new FileWriter(path, false)) { // или append true
            try {
                fileWriter.write(String.valueOf(string));
                fileWriter.flush();
            } catch (IOException e) {
                System.out.println("Произошла ошибка при записи");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла");
        }
    }

    /**
     * Чтение папки и вывод в консоль названий всех файлов
     * @param path путь к папке
     */
    public static void readDirectoryAndPrintFileNames(String path) {
        File file = new File(path);
        File[] content = file.listFiles();
        if(content != null){
            int number = 0;
            for (File file2 : content) {
                number++;
                System.out.println(number + ". " + file2.getName());
            }
        }
    }

}
