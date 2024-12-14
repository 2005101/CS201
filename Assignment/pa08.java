import java.util.*;
public class ex08 {

 public static void main(String[] args) {
 Scanner keyboard=new Scanner(System.in);
 System.out.print("How many scores? ");
 int n=keyboard.nextInt();
 double[] scores = new double[n];//collecting the scores and creating an array
 double total=0.0;// setting the total value initial to 0
 for (int i= 0; i<n; i++) {// asking the user to enter the score and the total value to add all the values togheter
 System.out.print("Enter score ");
 scores[i] = keyboard.nextDouble();
 total += scores[i];
 }
 double average=total/n;
 System.out.println("The average score is "+average);
 double max = Max(scores);// call out the method
 System.out.println("The highest score is "+max);

 for (int i=0; i<scores.length; i++){
 double score=scores[i];// array for the score values
 double difference = score - average;// calculating the differences
 if (difference > 0) {
 System.out.printf("%.2f is above average by %.2f\n", score, difference);
 } else if (difference < 0) {
 System.out.printf("%.2f is below average by %.2f\n", score, -difference);
 } else {
 System.out.printf("%.2f is exactly the average.\n", score);
 }
 }
 }
 public static double Max(double[] array){
 double largest = array[0];// initial largest value as the first one of the array
 for (int i = 1; i < array.length; i++) {
 if (array[i] > largest) {
 largest = array[i];
 }
 }
 return largest;
 }
}

public class Ledger{
 //data fields
 private double[] sale;// this is an array
 private int salesMade;// number of sales so far
 private int maxSales;// the max nb of sales that can be recorded
 //methods
 public Ledger(int max){
 maxSales=max;
 sale=new double[max]; // create the array in the memory
 salesMade=0;
 }
 public void addSale(double amount){
 sale[salesMade]=amount;
 salesMade++;
 }
 public int getNumberOfSales(){
 return salesMade;
 }
 public double getTotalSales(){
 double total = 0;
 for (int i = 0; i < salesMade; i++) {
 total += sale[i];
 }
 return total;
 }
 public double getAverageSale(){ // return the average after calculating it
 return getTotalSales() / salesMade;
 }
 public int getCountAbove(double value){ // this to count above average
 int count = 0;
 for (int i = 0; i < salesMade; i++) {
 if (sale[i] > value) {
 count++;
 }
 }
 return count;
 }
}
