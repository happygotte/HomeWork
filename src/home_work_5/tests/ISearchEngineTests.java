package home_work_5.tests;

import home_work_5.searchers.EasySearch;
import home_work_5.searchers.RegExSearch;
import home_work_5.searchers.SearchEngineCaseInsensitive;
import home_work_5.searchers.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISearchEngineTests {

    @Test
    public void easySearch() {
        EasySearch easySearch = new EasySearch();

        String text = "привет, как дела!";
        String word = "привет";
        String text1 = "привет,какдела!";
        String word1 = "как";
        String text2 = "как дела!.Что делаешь?";
        String word2 = "что";
        String text3 = "Привет -привет";
        String word3 = "Привет";
        String text4 = "Он говорил на том изысканном французском языке";
        String word4 = "язык";
        String text5 = "сказала Анна Павловна по-французски";
        String word5 = "по французски";
        String text6 = "привет;привет";
        String word6 = "привет";
        String text7 = "Кто предлагал ей чистый носовой платок, чтоб обтирать ручки, кто под ноги подкладывал ей венгерку, чтобы не было сыро, кто плащом завешивал окно, из которого дуло, кто обмахивал мух с лица ее мужа, чтобы он не проснулся";
        String word7 = "кто";

        Assertions.assertEquals(1, easySearch.search(text, word));
        Assertions.assertEquals(0, easySearch.search(text1, word1));
        Assertions.assertEquals(0, easySearch.search(text2, word2));
        Assertions.assertEquals(1, easySearch.search(text3, word3));
        Assertions.assertEquals(0, easySearch.search(text4, word4));
        Assertions.assertEquals(0, easySearch.search(text5, word5));
        Assertions.assertEquals(2, easySearch.search(text6, word6));
        Assertions.assertEquals(3, easySearch.search(text7, word7));
    }

    @Test
    public void regExSearch() {
        RegExSearch regExSearch = new RegExSearch();

        String text = "привет, как дела!";
        String word = "привет";
        String text1 = "привет,какдела!";
        String word1 = "как";
        String text2 = "как дела!.Что делаешь?";
        String word2 = "что";
        String text3 = "Привет -привет";
        String word3 = "Привет";
        String text4 = "Он говорил на том изысканном французском языке";
        String word4 = "язык";
        String text5 = "сказала Анна Павловна по-французски";
        String word5 = "по французски";
        String text6 = "потому что чт\\ им было за дело до нежных родительских чувств";
        String word6 = "чт ";
        String text7 = "Кто предлагал ей чистый носовой платок, чтоб обтирать ручки, кто под ноги " +
                "подкладывал ей венгерку, чтобы не было сыро, кто плащом завешивал окно, из которого " +
                "дуло, кто обмахивал мух с лица ее мужа, чтобы он не проснулся";
        String word7 = "кто";

        Assertions.assertEquals(1, regExSearch.search(text, word));
        Assertions.assertEquals(0, regExSearch.search(text1, word1));
        Assertions.assertEquals(0, regExSearch.search(text2, word2));
        Assertions.assertEquals(1, regExSearch.search(text3, word3));
        Assertions.assertEquals(0, regExSearch.search(text4, word4));
        Assertions.assertEquals(0, regExSearch.search(text5, word5));
        Assertions.assertEquals(0, regExSearch.search(text6, word6));
        Assertions.assertEquals(3, regExSearch.search(text7, word7));
    }

    @Test
    public void punctuationNormSearch() {
        SearchEnginePunctuationNormalizer search = new SearchEnginePunctuationNormalizer(new EasySearch());

        String text = "привет, как дела!";
        String word = "привет";
        String text1 = "привет,какдела!";
        String word1 = "дела!";
        String text2 = "как дела!.Что делаешь?";
        String word2 = "что";
        String text3 = "Привет -привет";
        String word3 = "Привет";
        String text4 = "Он говорил на том изысканном французском языке";
        String word4 = "  языке";
        String text5 = "сказала Анна Павловна по-французски";
        String word5 = "по французски";
        String text6 = "потому что чт\\ им было за дело до нежных родительских чувств";
        String word6 = "чт";
        String text7 = "Кто предлагал ей чистый носовой платок, чтоб обтирать ручки, кто под ноги " +
                "подкладывал ей венгерку, чтобы не было сыро, кто плащом завешивал окно, из которого " +
                "дуло, кто обмахивал мух с лица ее мужа, чтобы он не проснулся";
        String word7 = " кто";

        Assertions.assertEquals(1, search.search(text, word));
        Assertions.assertEquals(0, search.search(text1, word1));
        Assertions.assertEquals(0, search.search(text2, word2));
        Assertions.assertEquals(1, search.search(text3, word3));
        Assertions.assertEquals(0, search.search(text4, word4));
        Assertions.assertEquals(0, search.search(text5, word5));
        Assertions.assertEquals(1, search.search(text6, word6));
        Assertions.assertEquals(3, search.search(text7, word7));
    }

    @Test
    public void caseInsensitiveSearch() {
        SearchEngineCaseInsensitive search1 = new SearchEngineCaseInsensitive(new RegExSearch());

        String text = "привет, как дела!";
        String word = "привет";
        String text1 = "привет,какдела!";
        String word1 = "дела!";
        String text2 = "как дела!.Что делаешь?";
        String word2 = "что";
        String text3 = "Привет -привет";
        String word3 = "Привет";
        String text4 = "Он говорил на том изысканном французском языке";
        String word4 = "гОвОрИл";
        String text5 = "сказала Анна Павловна по-французски";
        String word5 = "анна павловна";
        String text6 = "Кто предлагал ей чистый носовой платок, чтоб обтирать ручки, кто под ноги " +
                "подкладывал ей венгерку, чтобы не было сыро, кто плащом завешивал окно, из которого " +
                "дуло, кто обмахивал мух с лица ее мужа, чтобы он не проснулся";
        String word6 = "кто";

        Assertions.assertEquals(1, search1.search(text, word));
        Assertions.assertEquals(0, search1.search(text1, word1));
        Assertions.assertEquals(1, search1.search(text2, word2));
        Assertions.assertEquals(2, search1.search(text3, word3));
        Assertions.assertEquals(1, search1.search(text4, word4));
        Assertions.assertEquals(1, search1.search(text5, word5));
        Assertions.assertEquals(4, search1.search(text6, word6));
    }
}

