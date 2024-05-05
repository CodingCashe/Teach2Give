/* Question 3: Power of Two
Write a program that takes an integer as input and returns true if the input is a power of two. */

public class Main {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8)); //true

        System.out.println(isPowerOfTwo(6)); //false
    }

    public static boolean isPowerOfTwo(int n) {
        return n !=0 && (n & (n-1)) ==0;
    }

}
