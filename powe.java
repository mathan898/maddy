import java.io.*;
import java.util.*;
class powe
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int b=ss.nextInt();
int p=ss.nextInt();
long result=1; 
while(p!=0)
{
result=result*b;
--p;
}
System.out.print(result);
}
}
