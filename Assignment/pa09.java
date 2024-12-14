public class Pa09 {
 public static void main(String[] args) {
 Ledger Ledger=new Ledger(5);
 // This entire page is hardcoded
 Ledger.addSale(30);
 Ledger.addSale(150.75);
 Ledger.addSale(290);
 Ledger.addSale(79);
 Ledger.addSale(161.63);
 System.out.println("Number of sales made: " + Ledger.getNumberOfSales());
 System.out.println("Total sales value: $" + Ledger.getTotalSales());
 System.out.println("Average sale value: $" + Ledger.getAverageSale());
 System.out.println("Sales above 100: " + Ledger.getCountAbove(100));// CAN THIS BE ANY VALUE?
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
