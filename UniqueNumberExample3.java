//Using Array
//We can also use an array to check the number is unique or not. 
//In this method, we find all the digits of the number and store it into an array. 
//After that, compare the values of all the indexes with each other. 
//If the values are the same, the number is not unique. 
//Remember that before comparing all the indexes we required to declare the size of the array (number of digits).
//UniqueNumberExample3.java

import java.util.Scanner;  
public class UniqueNumberExample3  
{  
//static method that checks the number is unique or not  
public static boolean isUniqueNumber(int number)   
{  
//count the number of digits in a number  
int digits = countDigits(number);  
//declaring and creating an array of digits  
int[] arr = new int[digits];  
for(int i=0; i<digits; i++)   
{  
//determines the last digits and adds it to the ith position  
arr[i] = (int)number%10;  
//removes the last digit  
number = number/10;  
}  
//compares array elements  
for(int i=0; i<digits; i++)   
{  
for(int j=0; j<digits; j++)   
{  
//returns true if both conditions are true      
if(i!=j && arr[i]==arr[j])  
return false;  
}  
}  
return true;  
}  
public static int countDigits(int number)   
{  
int count = 0;  
//executes until the condition becomes false  
while(number != 0)   
{  
//increments the variable count by 1  
count++;  
//removes last digits  
number= number/10;  
}  
return count;  
}  
public static void main(String args[])   
{  
//declare variables  
int number = 0;  
boolean result = false;  
//create Scanner class object to take input  
Scanner scan = new Scanner(System.in);  
System.out.print("Enter the number you want to check: ");  
//reading an integer from the user  
number = scan.nextInt();  
//invoking the method and parsing the number to be check  
result = isUniqueNumber(number);  
if(result)  
System.out.println(number +" is a unique number.");  
else  
System.out.println(number +" is not a unique number.");  
}  
}  