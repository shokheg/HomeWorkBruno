package homeWork7;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        String[] languagesList = {"ADA", "ALGOL", "B","BASIC" ,"C" ,"C++", "C#", "DART","GROOVY","JAVA", "JAVASCRIPT", "PHP", "PYTHON", "RUBY", "SWIFT"};
        System.out.println(doIKnowThisLanguage(languagesList,"GROOVY"));
        System.out.println(doIKnowThisLanguage(languagesList,"PHP"));
        System.out.println(doIKnowThisLanguage(languagesList,"PASCAL"));
    }

    public static boolean doIKnowThisLanguage(String[] languagesList, String language){

        return Arrays.binarySearch(languagesList, language) > 0;

    }


}
