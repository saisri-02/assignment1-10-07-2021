import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String : ");
String str=sc.nextLine();
char ch[]=str.toCharArray();
System.out.println("String before reverse : "+str);
String rev=" ";
for(int i=ch.length-1;i>=0;i--)
{
    rev+=ch[i];
}
System.out.println("String after reverse : "+rev);
}
}



Output:-

Enter String : 
Hello
String before reverse : Hello
String after reverse :  olleH
