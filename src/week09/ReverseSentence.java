package week09;
/*
    given a sentence , reverse the words but not each character
    "java is fun" -> "fun is java"
    "hello world" -> "world hello"
 */

import java.util.*;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "What are you doing right now";
        String[] allWords = sentence.split(" ");

        System.out.println("count of words =" + allWords.length);
        System.out.println(Arrays.toString(allWords));

        // print each word
        for( String each : allWords){
            System.out.println("each = " + each);
        }

        System.out.println("---------------------------");

        // reverse the sentence
        String reversed = "";

        for (int i = allWords.length - 1; i >= 0; i--) {
            //System.out.print(allWords[i] + " ");
            reversed += allWords[i] + " ";
        }

        System.out.println("reversed = " + reversed);
    }
}
