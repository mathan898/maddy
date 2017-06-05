import java.io.*;
import java.util.*;
class vowcon
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char n=s.next().charAt(0);
if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
{
System.out.println("vowels");
}
else
{
System.out.println("consonants");
}
}
}
