//happy no
//Happy Number are positive non-zero integer numbers. 
//If we find the sum of the squares of its every digit and repeat that process until the number will be equals to 1(one). 
//Otherwise, it is called Unhappy Number or Sad Number.
import java.util.*;
public class HappyNumber
{
public static int checkHappyNumber (int number)
{
int rem = 0, sum = 0;
// calculate the sum of squares of each digits
while(number > 0)
{
rem = number %10;
sum = sum+(rem*rem);
number = number/10;
}
return sum;
}
public static void main(String[] args)
{
// Take number from KeyBoard
Scanner sc = new Scanner (System.in);
System.out.print("Enter a non-zero Positive Number:");
int number = sc.nextInt( );
int result = number;
while (result != 1 && result != 4)
{
result = checkHappyNumber(result);
}
if (result ==1)
{
System.out.println ("It is a Happy Number");
}
else
{
System.out.println (" It is not a Happy Number");
}
}
}