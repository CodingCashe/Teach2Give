/* Question 6: Count Vowels
Write a program that counts the number of vowels in a sentence.*/

public class Main {
    public static void main(String[] args) {

        System.out.println(countVowels("Hello Simon")); 
    }

    public static int countVowels(String sentence) {

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < sentence.length(); i++) {
            
            if (vowels.indexOf(sentence.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
