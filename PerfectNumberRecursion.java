//Using Recursion
//PerfectNumberExample3.java

import java.util.Scanner;

public class PerfectNumberRecursion {
    static long sum = 0;

    long isPerfect(long num, int i) {
        // executes until the condition becomes false
        if (i <= num / 2) {
            if (num % i == 0) {
                // calculates the sum of factors
                sum = sum + i;
            }
            // after each iteration, increments the value of variable i by 1
            i++;
            // recursively called function
            isPerfect(num, i);
        }
        // returns the sum of factors
        return sum;
    }

    // driver code
    public static void main(String args[]) {
        long number, s;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // reads a number from the user
        number = sc.nextLong();
        // creating an object of the class
        PerfectNumberExample3 pne = new PerfectNumberExample3();
        s = pne.isPerfect(number, i);
        // compares sum with the number
        if (s == number)
            // prints if the s and number are equal
            System.out.println(number + " is a perfect number");
        else
            // prints if s and number are not equal
            System.out.println(number + " is not a perfect number");
    }
}