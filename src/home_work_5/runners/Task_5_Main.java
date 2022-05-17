package home_work_5.runners;

import home_work_5.BookString;
import home_work_5.searchers.SearchEngineCaseInsensitive;
import home_work_5.searchers.SearchEnginePunctuationNormalizer;
import home_work_5.api.ISearchEngine;
import home_work_5.searchers.EasySearch;
import home_work_5.searchers.RegExSearch;

public class Task_5_Main {
    public static void main(String[] args) {
        String path = "Война и мир_книга.txt";

        String warAndPeaceString = BookString.readWithBufferReader(path);

        EasySearch easySearch = new EasySearch();

        System.out.println("Поиск слов с помощью поисковика EasySearch:");
        System.out.println("война: " + easySearch.search(warAndPeaceString, "война"));
        System.out.println("и: " + easySearch.search(warAndPeaceString, "и"));
        System.out.println("мир: " + easySearch.search(warAndPeaceString, "мир"));

        RegExSearch regExSearch = new RegExSearch();

        System.out.println("Поиск слов с помощью поисковика RegExSearch:");
        System.out.println("война: " + regExSearch.search(warAndPeaceString, "война"));
        System.out.println("и: " + regExSearch.search(warAndPeaceString, "и"));
        System.out.println("мир: " + regExSearch.search(warAndPeaceString, "мир"));

        ISearchEngine iSearchEngine = new SearchEnginePunctuationNormalizer(new EasySearch());

        System.out.println("Поиск слов с помощью декоратора SearchEnginePunctuationNormalizer:");
        System.out.println("война: " + iSearchEngine.search(warAndPeaceString, "война"));
        System.out.println("и: " + iSearchEngine.search(warAndPeaceString, "и"));
        System.out.println("мир: " + iSearchEngine.search(warAndPeaceString, "мир"));

        ISearchEngine iSearchEngine2 = new SearchEngineCaseInsensitive(new EasySearch());

        System.out.println("Поиск слов независимо от регистра с помощью декоратора SearchEngineCaseInsensitive:");
        System.out.println("война: " + iSearchEngine2.search(warAndPeaceString, "война"));
        System.out.println("и: " + iSearchEngine2.search(warAndPeaceString, "и"));
        System.out.println("мир: " + iSearchEngine2.search(warAndPeaceString, "мир"));


    }
}
