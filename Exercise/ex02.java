package ex02;
import java.util.*;
public class ex02 {
 public static void main(String[] args) { // this is the main function // can we use the other one with print and other stuff like in
this one.//
 //input
 Scanner keyboard=new Scanner(System.in);
 System.out.print("Enter a a non-negative integer: ");
 int n=keyboard.nextInt();
 // process
 //output
 if (isprime(n))
 System.out.println(n+" is a prime number!");
 else
 System.out.println(n+" is not a prime number!");
 keyboard.close();
 }
 public static boolean isprime (int n) { // our new defined function
 if (n==0|| n==1) // because we know that 0 and 1 are NOT prime numbers
 return false;
 for (int m= 2; m <=n-1; m++) { // NOT understood here for m<=n-1/// 5/4 max
 if (n%m==0)
 return false;
 }
 return true; // we did all the test, but there is no true value. thus, it is true
 }

 }
