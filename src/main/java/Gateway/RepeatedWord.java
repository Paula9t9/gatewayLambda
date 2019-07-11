/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Gateway;

import java.util.HashMap;

public class RepeatedWord {


    public static String repeatedWord(String originalString){
        String[] wordArray = originalString.split(" ");
        HashMap wordsSoFar = new HashMap(wordArray.length * 2);

        for(String word : wordArray){
            //Sanitize the word for better comparison.
            //Used Geeks for Geeks to figure out how to strip punctuation:
            // https://www.geeksforgeeks.org/removing-punctuations-given-string/
            word = word.replaceAll("\\p{Punct}","");

            word = word.toLowerCase();

            //Check if we have encountered this word already, and proceed accordingly
            if (wordsSoFar.containsKey(word)){
                return word;
            }else {
                wordsSoFar.put(word, word);
            }
        }

        //We made it through all the words and found no repeats. Return an empty string
        return "";

    }
}
