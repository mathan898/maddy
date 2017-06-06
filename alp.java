import java.io.*;
import java.util.*;
class alp
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char n=s.next().charAt(0);
if(n>='a' && n<='z'||n>='A' && n<='Z')
{
System.out.println("alphabets");
}
else
{
System.out.println("not a alphabet");
}
}
}
