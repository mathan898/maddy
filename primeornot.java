import java.io.*;
import java.util.*;
class primeornot
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
boolean isprime=true;
int num=ss.nextInt(),temp;
for(int i=2;i<=num/2;i++)
{
temp=num%i;
if(temp==0)
{
isprime=false;
break;
}
}
if(isprime)
System.out.print("prime");
else
System.out.print("not prime");
}
}
