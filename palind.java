import java.io.*;
import java.util.*;
class palind
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s1=ss.nextLine();
String reverse="";
int len=s1.length();
for(int i=len-1;i>=0;i--)
{
reverse=reverse+s1.charAt(i);
}
if(s1.equals(reverse))
{
System.out.print("palindrome");
}
else
{
System.out.print("not palindrome");
}
}
}
