import java.util.*;
public class program22 {
 public static void main(String[] args) {
 // Input
 int x;
 double p;
 Scanner keyboard = new Scanner(System.in);
 System.out.print("Enter the number of packages: ");
 x = keyboard.nextInt();
 // Process
 if (x >= 100) {
 p = 0.40;
 } else if (x >= 50) {
 p = 0.30;
 } else if (x >= 20) {
 p = 0.20;
 } else if (x >= 10) {
 p = 0.10;
 } else {
 p = 0.00;
 }
 double total=x*99;
 double discount = p *total;
 double amountafter= total - discount;
 System.out.printf("Amount of Discount: %.1f", discount);
 System.out.println("");
 System.out.printf("Total amount after discount: %.1f", amountafter);
 keyboard.close();
 }
}
