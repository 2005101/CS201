import java.util.*;
public class ex02 {
 public static void main(String[] args) {
 //input
 int x;
 boolean flag; //true-leap false-not leap year
 Scanner keyboard= new Scanner(System.in);
 System.out.println("Enter a year ");
 x = keyboard.nextInt();
 //proccess

 if (x%4!=0) flag=false;
 else if (x%100!=0) flag=true;
 else if (x%400!=0) flag=false;
 else flag=true;
 // output
 if (flag==true)
 System.out.println(x+" is a leap year!");
 else
 System.out.println(x+ " is not a leap year! ");
 }
}
