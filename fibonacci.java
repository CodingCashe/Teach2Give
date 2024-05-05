/*Question 2: Fibonacci Sequence
Write a program to generate the Fibonacci sequence up to 100.*/
//
public class Main {
    
    public static void main(String[] args) {

        int n = 100;
        int[] fibSequence = new int[n];

        fibSequence[0] = 0;
        fibSequence[1] = 1;
        int i = 2;
        while (fibSequence[i - 1] + fibSequence[i - 2] <= n) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.print(fibSequence[j] + " ");
        }
    }

}
