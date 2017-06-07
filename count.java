import java.io.*;
import java.util.*;
class count
{
public static void main(String args[])
{
int count=0,b;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}
