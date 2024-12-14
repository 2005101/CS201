import java.util.*;
public class ex02 {
 public static void main(String[] args) {
 //input
 int x,y,t;
 Scanner keyboard=new Scanner(System.in);
 System.out.print("Enter the male student number: ");
 x = keyboard.nextInt();
 System.out.print("Enter the female student number: ");
 y=keyboard.nextInt();
 //proccess
 t=x+y;
 int a=(int) (100.*x/t);
 int b=(int) 100*y/t;
 //output
 System.out.print("Male student percentage: %"+a);
 System.out.println();
 System.out.print("Female student percentage: %"+b);
 }
}
