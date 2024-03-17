public class Main {
    public static void main(String[] args) {
        LanguageList languageList = new LanguageList();
        System.out.print("Is My list of languages empty? ");
        System.out.println(languageList.isEmpty());
        System.out.println("I want to add language English to my list.");
        System.out.println("Language size before added new language: " + languageList.sizeOfList());
        languageList.addLanguage("English");
        System.out.println("Language size after added new language: " + languageList.sizeOfList());

    }
}