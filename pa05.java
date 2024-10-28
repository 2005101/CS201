import java.util.*;
public class programming05 {
 public static void main(String[] args) {
 // Input
 Scanner keyboard = new Scanner(System.in);
 System.out.print("The amount invested: ");
 double investmentAmount = keyboard.nextDouble();
 System.out.print("Annual interest rate (e.g., 0.09 for 9%): ");
 double interest = keyboard.nextDouble();
 double monthlyInterestRate = interest / 12;
 System.out.println("Years\t\tFuture Value");
 for (int year = 1; year <= 30; year++) {
 double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
 System.out.printf("%d\t\t%.2f\n",year,futureValue);
 }
 }
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year) {
 return investmentAmount * Math.pow((1 + monthlyInterestRate), (year * 12));
 }
}
