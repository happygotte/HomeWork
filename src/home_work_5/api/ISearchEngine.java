package home_work_5.api;

public interface ISearchEngine {

    /**
     * Метод считает, сколько раз слово встречается в тексте
     * @param text текст, в котором осуществляется поиск
     * @param word искомое слово
     * @return количество повторений слова в тексте
     */
    long search(String text, String word);
}
