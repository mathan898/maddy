import java.io.*;
import java.util.*;
class sapp
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
char tmp=0;
char ch[]=s.toCharArray();
for(int i=0;i<s.length()-1;i=i+2)
{
      tmp = ch[i];
     ch[i] = ch[i+1];
     ch[i+1] = tmp;
System.out.print(ch[i]+""+tmp);
}
}
}
