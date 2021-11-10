import java.io.*;
import java.util.*;
class oddint
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt(),flag=0;
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]%2==0)
{
System.out.print(a[i]+" ");
System.out.print(a[i]+" ");
}
}
}
}
