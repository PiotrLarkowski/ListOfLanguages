import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public int sizeOfList(){
        return languages.size();
    }

    public boolean isEmpty() {
        return languages.isEmpty();
    }
    public void addLanguage(String language) {
        languages.add(language);
    }
    public void removeLanguage(String language) {
        languages.remove(language);
    }
}
