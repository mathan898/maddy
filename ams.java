import java.io.*;
import java.util.*;
class ams
{
public static void main(String str[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a, b=0, c=n;
while(n>0)
{
a=n%10;  
n=n/10;  
b=b+(a*a*a);
}
if(c==b) 
System.out.println("Armstrong number");
else      
System.out.println(" Not Armstrong number");
System.out.println(" Not Armstrong number");
System.out.println(" Not Armstrong number");
System.out.println(" Not Armstrong number");
}
}
