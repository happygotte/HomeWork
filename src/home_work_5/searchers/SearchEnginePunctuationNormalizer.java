package home_work_5.searchers;

import home_work_5.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private final ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    public String editString(String text) {
        return text.replaceAll("(--)|[.,!?=*;:\"()]|(\\s*-\\s+)|(\\s+-\\s*)", " ");

    }

    @Override
    public long search(String text, String word) {
        text = editString(text);
        return this.iSearchEngine.search(text, word);
    }
}
