package homeWork7;

public class Task2 {

    public static void main(String[] args) {

        String[] languagesList = {"ADA", "ALGOL", "B","BASIC" ,"C" ,"C++", "C#", "DART","GROOVY","JAVA", "JAVASCRIPT", "PHP", "PYTHON", "RUBY", "SWIFT"};
        System.out.println(doIKnowThisLanguage(languagesList,"GROOVY"));
        System.out.println(doIKnowThisLanguage(languagesList,"PHP"));
        System.out.println(doIKnowThisLanguage(languagesList,"PASCAL"));
    }

    public static boolean doIKnowThisLanguage(String[] languagesList, String language){

        return binarySearch(languagesList, language) > 0;

    }

    static int binarySearch(String[] languageList, String language){

        int left = 0, right = languageList.length - 1;
        while (left <= right) {
            int medium = left + (right - left) / 2;

            int res = language.compareTo(languageList[medium]);

            if (res == 0) //если искомая строка попалась нам с первого раза посередине
                return medium;

            if (res > 0)
                left = medium + 1;
            else
                right = medium - 1;
        }

        return -1;
    }


}
