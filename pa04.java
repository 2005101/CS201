import java.util.*;
public class programming04 {
 public static void main(String[] args) {
 Scanner keyboard=new Scanner(System.in);
 System.out.print(" How many prime numbers do you want to display: ");
 int n=keyboard.nextInt();
 // process
 //output
 System.out.println("The first " + n + " prime numbers are:");
 int count = 0;
 int num= 2;
 while (count < n) {
 if (isprime(num)) {
 count++;
 System.out.println("The " + count +ranking(count)+ " prime number is " + num);
 }
 num++;
 }
 }
 public static boolean isprime (int n) {
 if (n==0|| n==1)
 return false;
 for (int m= 2; m <=n-1; m++) {
 if (n%m==0)
 return false;
 }
 return true;
 }
 public static String ranking(int rank) {
 if (rank % 10 == 1 && rank % 100 != 11) {
 return "st";
 } else if (rank % 10 == 2 && rank % 100 != 12) {
 return "nd";
 } else if (rank % 10 == 3 && rank % 100 != 13) {
 return "rd";
 } else {
 return "th";
 }
 }

 }
