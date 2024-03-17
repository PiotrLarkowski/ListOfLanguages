public class Main {
    public static void main(String[] args) {
        LanguageList languageList = new LanguageList();
        System.out.print("Is My list of languages empty? ");
        System.out.println(languageList.isEmpty());
        System.out.println("I want to add language English to my list.");
        System.out.println("Language size before added new language: " + languageList.sizeOfList());
        languageList.addLanguage("English");
        System.out.println("Language size after added new language: " + languageList.sizeOfList());
        System.out.println("I decide to remove English from my list");
        System.out.println("Language size before added new language: " + languageList.sizeOfList());
        languageList.removeLanguage("English");
        System.out.println("Language size after added new language: " + languageList.sizeOfList());
        System.out.println("What is the first language on my list? " + languageList.firstLanguage());
        System.out.println("Add English to my list");
        languageList.addLanguage("English");
        System.out.println("What is the first language on my list? " + languageList.firstLanguage());
    }
}