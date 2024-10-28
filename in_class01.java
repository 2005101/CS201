
import java.util.*;
public class homework01 {
 
public static void main(String[] args) {
 
 
Scanner Keyboard = new Scanner(System.in);
 
System.out.print("Enter the Fahrenheit temperature: ");
 
double ftemp = Keyboard.nextDouble();
 
//System.out.println(ftemp);
 
// proccess
 
double ctemp=5.0/9*(ftemp-32);
 
//output
 
//System.out.print("The corresponding celcius temp is "+ctemp);
 
System.out.printf("%.3f degrees fahrenheit is %.3f degrees centigrade.",ftemp,ctemp);
 
}
}
