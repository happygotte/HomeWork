package home_work_5;

import java.util.*;

public class AddingToCollection {

    /**
     * Замена в строке знаков препинания на пробел и разбиени строки на слова по пробелам
     * @param string Строка, которую необходимо обработать и разбить на слова
     * @return массив строк
     */
    public String[] split(String string) {
        string = string.replaceAll("(--)|[.,!?=*;:\"()]|(\\s*-\\s+)|(\\s+-\\s*)", " ");
        return string.split("\\s+");
    }

    /**
     * Добавление каждого слова из передаваемой строки в Set
     * @param string строка, слова из которой необходимо добавить в коллекцию
     * @return коллекция из слов
     */
    public Set<String> addSet(String string) {
        Set<String> setBook = new HashSet<>();
        Collections.addAll(setBook, split(string));
        return setBook;
    }

    /**
     * Добавление строки в коллекцию Мар
     * @param string строка, слова из которой необходимо добавить в коллекцию
     * @return коллекция из слов типа Мар
     */
    public Map<String, Integer> addMap(String string) {
        Map<String, Integer> mapBook = new HashMap<>();
        String[] words = split(string);

        for (String word : words) {

            if (mapBook.containsKey(word)){
                mapBook.put(word, mapBook.get(word) + 1);
            } else {
                mapBook.put(word, 1);
            }
        }
        return mapBook;
    }

    /**
     * Добавление строки в коллекцию Map, преобразование в коллекцию Map.Entry, сортировка и создание новой Мар
     * @param string строка, в которой необходимо посчитать количество повторений каждого слова
     * @return Мар-коллекция, отсортированная по убыванию значения
     */
    public Map<String, Integer> sortMap(String string) { //или можно сразу мар передавать, но хотелось отталкиваться только от строки
        Map<String, Integer> mapBook = addMap(string);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapBook.entrySet());

        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    /**
     * Вычленение части коллекции от начала
     * @param sortMap коллекция, часть которой необходимо вывести
     * @param num необходимое количество позиций
     */
    public void top(Map<String, Integer> sortMap, int num) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(sortMap.entrySet());

        int count = 0;
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry);
            count++;
            if (count == num) {
                break;
            }
        }
    }

}