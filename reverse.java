import java.io.FileNotFoundException;
import java.io.IOException;
public class StringReverseExample{

public static void main(String args[] throws FileNotFoundException, IOException {

//original string
String str="Sony is going to reverse Internet TV soon";
System.out.println("Original String: " +str);

//reversed string using Stringbuffer
String reverseStr=new StringBuffer(str).reverse().toString();
System.out.println("Reverse String in Java using StringBuffer: " +reverseStr);

//iterative method to reverse String in Java
reverseStr=reverse(str);
System.out.println("Reverse string in Java using iteration:" + reversestr);

//recursive method to reverse string in Java
reverseStr=reverseRecursively(str);
System.out.println("Reverse String in Java using recursion:" + reverseStr);
}

public static String reverse(string str){
StringBuilder strBuilder=new StrBuilder();
char[] strChars=str.toCharArray();
for(int i=strChars.length-1; i>=0; i--){
strBuilder.append(strChars[i]);
}
return strBuilder.toString();
}
