/* Question 4: Capitalize Words
Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string. */

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        System.out.println(capitalizeWords("hi")); // "Hi"

        System.out.println(capitalizeWords("i love programming")); // "I Love Programming"
    }

    public static String capitalizeWords(String sentence) {

        String[] words = sentence.split(" ");

        StringJoiner result = new StringJoiner(" ");

        for (String word : words) {

            result.add(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
        return result.toString();
    
    }
}

