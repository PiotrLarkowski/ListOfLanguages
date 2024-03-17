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
    public String firstLanguage() {
        if(languages.isEmpty()){
            return "List is empty";
        }
        return languages.get(0);
    }
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }
    public boolean isExciting() {
        for(String name: languages){
            if(name.equals("Java")||name.equals("Kotlin")){
                return true;
            }
        }
        return false;
    }
}
