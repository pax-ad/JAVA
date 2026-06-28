import java.util.Scanner;
// includes the library and methods of java 
public class Input{
public static void main (String args[]){
//basic inout output java program
Scanner sc = new Scanner(System.in);
String str = sc.next();
System.out.println("Enter your string : " + str);
sc.close();

}
}

//mistakes 
//1. duplicate variable
//2. what are you printing .
//3.next() vs nextline()