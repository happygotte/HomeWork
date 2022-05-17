package home_work_5.runners;

import home_work_5.BookString;
import home_work_5.AddingToCollection;

import java.io.IOException;
import java.util.Map;

public class Task_2_Main {
    public static void main(String[] args) throws IOException {
        String path = "Война и мир_книга.txt";

        //получили строку из указанного выше файла
        String warAndPeaceString = BookString.readWithBufferReader(path);

        AddingToCollection addingToCollection = new AddingToCollection();

        //вывели в консоль количество слов
        long amountWords = addingToCollection.addSet(warAndPeaceString).size();
        System.out.println("Общее количество слов в романе: " + amountWords);


        //Отсортированная коллекция типа Map по убыванию значения
        Map<String, Integer> mapBookSort = addingToCollection.sortMap(warAndPeaceString);

        //Вывод топ-N слов из отсортированной Мар
        System.out.println("Наиболее часто используемые слова в романе:");
        addingToCollection.top(mapBookSort, 100);





    }
}
