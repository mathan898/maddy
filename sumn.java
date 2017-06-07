import java.io.*;
import java.util.*;
class sumn
{
public static void main(String args[])
{
int i=0,sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(sum);
}
}
