import java.io.*;
import java.util.*;
class power
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
int result=1;
for(int i=0;i<p;i++)
{
result=result*n;
}
System.out.println(result);
}
}
