/* Question 5: Reverse Integer

Write a program that takes an integer as input and returns an integer with reversed digit
ordering. */

public class Main {//

    public static void main(String[] args) {

        System.out.println(reverseInteger(500)); // 5

        System.out.println(reverseInteger(-56)); //-65

        System.out.println(reverseInteger(-90)); //-9

        System.out.println(reverseInteger(91)); //19
    }

    public static int reverseInteger(int num) {

        boolean isNegative = num < 0;

        String reversed = new StringBuilder(String.valueOf(Math.abs(num))).reverse().toString();

        int result = Integer.parseInt(reversed);
        return isNegative ? -result : result; //this a ternary operator
    }
}
