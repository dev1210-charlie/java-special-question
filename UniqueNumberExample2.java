//Using String
//Using String, we can also check the number is unique or not. We use the charAt() method of the String to compare each digit of the string.
//UniqueNumberExample2.java

import java.util.*;  
public class UniqueNumberExample2  
{  
public static void main(String args[] )  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number you want to check:");  
//reading an integer from the user  
int number=sc.nextInt();  
//converts integer data type into string  
String str= Integer.toString(number);   
//determines the length of the string  
int length=str.length();  
int flag=0, i, j;  
//loop checks the digits are repeated or not  
for(i=0;i<length-1;i++)  
{  
for(j=i+1;j<length;j++)  
{  
//comparing each digit, if digits are repeated the number is not unique       
if(str.charAt(i)==str.charAt(j))   
{   
flag=1;  
break;   
}  
}  
}  
//if flag is equal to zero the number is unique  
if(flag==0)  
System.out.println("The number is unique.");  
else  
System.out.println("The number is not unique.");  
}  
}  