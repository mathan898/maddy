import java.io.*;
import java.util.*;
class countprime
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int count=0,i;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]%2!=0 && a[i]%3!=0 && a[i]%5!=0)
{
count++;
}
}
System.out.print(count);
}
}
