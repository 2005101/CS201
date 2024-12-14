public class Fraction {
 //data fields-member variables
 private int top;
 private int bottom;
 //methods-member functions
 //this is the constructor with 2 argument
 public Fraction(int top, int bottom) // parameter value+local variable
 {
 this.top=top; //this is for the data field of the class
 this.bottom=bottom;
 }
 //mutators with set keyword
 public void set_top(int top)
 {
 this.top=top;
 }
 public void set_bottom(int bottom)
 {
 this.bottom=bottom;
 }
 public void output()
 {
 System.out.println(top+"/"+bottom);
 }
 public double calculate()
 {
 return (double)top/bottom*100;
 }
}
/**
 * ex07
 */
public class ex07 {
 public static void main(String[] args) {
 Fraction f1=new Fraction(2, 3);
 f1.output();
 f1.set_top(1);
 f1.output();
 System.out.printf("%.2f%%\n",f1.calculate());
 }
}
