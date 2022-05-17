package home_work_5.searchers;

import home_work_5.api.ISearchEngine;

import java.util.Locale;

public class SearchEngineCaseInsensitive implements ISearchEngine {

    private final ISearchEngine iSearchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        return this.iSearchEngine.search(lowerText, lowerWord);
    }
}
