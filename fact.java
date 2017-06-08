import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int result=1,i;
for(i=1;i<=n;i++)
{
result=result*i;
}
System.out.println(result);
}
}
