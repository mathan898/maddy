import java.io.*;
import java.util.*;
class commaaa
{
public static void main(String args[])
{
String s1="",s4="";
Arrays.sort(args);
for(int i=0;i<args.length;i++)
s1=s1+args[i];
for(int i=0;i<args.length;i+=3)
{
if(i<(s1.length()-3))
{
String s2=s1.substring(i,i+3);
s4+=s2+",";
}
else
{
String s2=s1.substring(i);
s4+=s2;
}
}
StringBuffer ss=new StringBuffer(s4);
System.out.print(ss.reverse());
}
}
