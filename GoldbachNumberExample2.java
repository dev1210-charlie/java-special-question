//Goldbach Number in Java
//Let's see another logic to find the Goldbach number.
//GoldbachNumberExample2.java

import java.util.*;  
public class GoldbachNumberExample2  
{  
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the number: ");  
int n=sc.nextInt();  
int po[]=new int[n/2];  
int i,j,s=0,c,k=0,r;  
if(n%2==0)  
{  
for(i=1;i<=n;i+=2)  
{  
c=0;  
for(j=1;j<=i;j++)  
{  
if(i%j==0)  
c++;  
}  
if(c==2)  
{  
po[k]=i;  
k++;  
}  
}  
for(i=0;i<n/2;i++)  
{  
r=po[i];  
for(j=i+1;j<n/2;j++)  
{  
s=r+po[j];  
if(s==n)  
{  
System.out.println("It is a goldbach number.");  
System.exit(0);  
}  
else  
s=r;  
}  
}  
System.out.println("It is not a goldbach number.");  
}  
else  
System.out.println("Invalid input! Please input an even number.");  
}  
}  