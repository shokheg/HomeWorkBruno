package homeWork8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(sameWords(words));

    }

    public static Map<String,Integer> sameWords (List<String> words){

        Map<String,Integer> sameWords = new HashMap<>();

        for (String word: words){
            if (sameWords.keySet().contains(word)){
                sameWords.put(word,sameWords.get(word)+1);
            } else {
                sameWords.put(word,1);
            }
        }
        return  sameWords;


    }

}
