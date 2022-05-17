package home_work_5.searchers;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {


    /**
     * Поиск слова в строке и подсчёт количества его повторений c учётом регистра
     * @param text текст, в котором осуществляется поиск
     * @param word искомое слово
     * @return количество повторений слова в тексте
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        int fromIndex = text.indexOf(word);
        while (fromIndex != -1) { //!(fromIndex > (text.length() - word.length())))

            //Если предыдущий и следующий символы за найденной подстрокой - не буква, то слово подходит
            //Не получается убрать уродские повторы
            if (fromIndex == 0 && !Character.isLetter(text.charAt(fromIndex + word.length()))) {
                count++;
            } else if (fromIndex == (text.length() - word.length()) &&
                    !Character.isLetter(text.charAt(fromIndex - 1))) {
                count++;
            } else if (!Character.isLetter(text.charAt(fromIndex - 1)) &&
                        !Character.isLetter(text.charAt(fromIndex + word.length()))) {
                        count++;
            }
            fromIndex = text.indexOf(word, fromIndex + word.length());
        }
        return count;
    }
}

