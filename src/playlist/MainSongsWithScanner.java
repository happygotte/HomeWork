package playlist;

import playlist.predicates.FilterByGenre;
import playlist.predicates.FilterByMood;
import playlist.suppliers.ListOfSongsFromFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainSongsWithScanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Укажите адрес файла со списком песен");
        String path = console.next();

        Supplier<List<Song>> supplier = new ListOfSongsFromFile(path); //"songs.txt"
        List<Song> songs = supplier.get();

        WorkWithFiles workWithFiles = new WorkWithFiles();

        int number = 1;
        for (Song song : songs) {
            System.out.print(number + ". ");
            System.out.print(workWithFiles.stringForWrite(song));
            number++;
        }

        System.out.println("Укажите жанр песни");
        String genre = console.next();

        Predicate<Song> filterByGenre = new FilterByGenre(genre);

        List<Song> filtered1 = new ArrayList<>();

        for (Song item : songs) {
            if(filterByGenre.test(item)){
                filtered1.add(item);
            }
        }

        if (filtered1.size() > 0) {
            int number1 = 1;
            for (Song song : filtered1) {
                System.out.print(number1 + ". ");
                System.out.print(workWithFiles.stringForWrite(song));
                number1++;
            }
        } else {
            System.out.println("В списке нет песен в таком жанре");
        }

        System.out.println("Укажите настроение песни");
        String mood = console.next();

        Predicate<Song> filterByMood = new FilterByMood(mood);

        List<Song> filtered2 = new ArrayList<>();

        for (Song item : filtered1) {
            if(filterByMood.test(item)){
                filtered2.add(item);
            }
        }

        if (filtered2.size() > 0) {
            int number2 = 1;
            for (Song song : filtered2) {
                System.out.print(number2 + ". ");
                System.out.print(workWithFiles.stringForWrite(song));
                number2++;
            }
        } else {
            System.out.println("В списке нет песен в таком настроении");
        }

    }
}
