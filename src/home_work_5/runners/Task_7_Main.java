package home_work_5.runners;

import home_work_5.BookString;
import home_work_5.ReadAndWrite;
import home_work_5.api.ISearchEngine;
import home_work_5.searchers.RegExSearch;
import home_work_5.searchers.SearchEngineCaseInsensitive;

import java.util.Scanner;

public class Task_7_Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите адрес папки"); // C:\Users\Maria\IdeaProjects\JD1\books
        String path = console.nextLine();

        //Чтение папки и вывод в консоль названий всех файлов
        ReadAndWrite.readDirectoryAndPrintFileNames(path);

        while (true) {

            //Выбор файла
            System.out.println("Введите имя файла. Для выхода введите *");
            String fileName = console.nextLine();

            //Выход из цикла и завершение программы
            if (fileName.equals("*")) {
                break;
            }
            //Чтение файла в строку
            String text = BookString.readWithBufferReader(path + "\\" + fileName);

            while (true) {

                System.out.println("Введите текст, который необходимо найти. Для выхода введите *");
                String searchText = console.nextLine();

                //Выход из цикла на уровень выше для нового выбора файла
                if (searchText.equals("*")) {
                    break;
                }

                //Поиск в тексте
                ISearchEngine iSearchEngine1 = new SearchEngineCaseInsensitive(new RegExSearch());
                String resultString = fileName + " - " + searchText + " - " +
                        iSearchEngine1.search(text, searchText) + "\n";
                System.out.println(resultString);

                //Запись результатов поисков в отдельный файл
                ReadAndWrite.write(resultString, "C:\\Users\\Maria\\IdeaProjects\\JD1\\result.txt");
            }
        }
    }
}
