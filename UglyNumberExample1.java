//import required classes and packages  
import java.io.*;  
import java.util.*;  
  
//create UglyNumberExample1 class to get Nth Ugly number  
class UglyNumberExample1 {  
   
    // create a method divideByGreatestDivisible() method for dividing the number by the given greatest divisible power  
    static int divideByGreatestDivisible(int number, int gdp)  
    {  
        while (number % gdp == 0)  
            number = number / gdp;  
        return number;  
    }  
   
    // create checkUglyNumber() method that returns true when the number is an Ugly  
    static boolean checkUglyNumber(int number)  
    {  
        number = divideByGreatestDivisible(number, 2);  
        number = divideByGreatestDivisible(number, 3);  
        number = divideByGreatestDivisible(number, 5);  
   
        return (number == 1) ? true : false;  
    }  
   
    //create findNthUglyNumber() method for getting the nth Ugly number  
    static int findNthUglyNumber(int NthNumber)  
    {  
        int number = 1;  
   
        // initialize counter  
        int counter = 1;  
   
        // using  while loop to get Nth Ugly number  
        while (NthNumber > counter) {  
            number++;  
            if (checkUglyNumber(number))  
                counter++;  //increment counter value  
        }  
        return number;  
    }  
   
    //main() method start  
    public static void main(String args[])  
    {  
          
        int NthNumber1, NthNumber2;  
          
        //create scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first Nth value");  
          
        //store user entered value into variable NthNumber1  
        NthNumber1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second Nth value");  
          
        //store user entered value into variable NthNumber2  
        NthNumber2 = sc.nextInt();  
          
        System.out.println("The " + NthNumber1 + "th Ugly number is: " + findNthUglyNumber(NthNumber1));  
        System.out.println("The " + NthNumber2 + "th Ugly number is: " + findNthUglyNumber(NthNumber2));  
    }  
}  