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
