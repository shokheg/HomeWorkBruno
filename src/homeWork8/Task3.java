package homeWork8;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        String word = "uncover";
        Map <Integer, String> textMap = new HashMap<>();
        addTextToHashMap(textMap, text);
        System.out.println("Слово " + word + " встречается в тексте " + wordsFrequencyCount(textMap,word) + " раз!");

    }

    static void addTextToHashMap(Map<Integer, String> textMap,String text){


        Scanner scanner = new Scanner(text);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        for (int i = 0; scanner.hasNext(); i++) {
            textMap.put(i, scanner.next());
        }


    }

     static int wordsFrequencyCount(Map<Integer, String> inputMap, String word){

        Map<String,Integer> outputMap = new HashMap<>();

        for(Map.Entry<Integer,String> entry: inputMap.entrySet()){
            if (outputMap.keySet().contains(entry.getValue())){
                outputMap.put(entry.getValue(), outputMap.get(entry.getValue())+1);
            } else {
                outputMap.put(entry.getValue(), 1);
            }
        }

        return outputMap.get(word);
    }

}
