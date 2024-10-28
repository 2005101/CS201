import java.util.Scanner;
public class Triangle{
//data fields
private double side1;
private double side2;
private double side3;
//methods
public void input()
 {
 Scanner Keyboard=new Scanner(System.in);
 System.out.print("Please enter the value for side 1: ");
 side1=Keyboard.nextDouble();
 System.out.print("Please enter the value for side 2: ");
 side2=Keyboard.nextDouble();
 System.out.print("Please enter the value for side 3: ");
 side3=Keyboard.nextDouble();
 while ((side1+side2<side3)||(side1+side3<side2)||(side2+side3<side1)||(side1+side1<side3)) {
 System.out.println("This is not a Triangle");
 System.out.print("Please enter the value for side 1: ");
 side1=Keyboard.nextDouble();
 System.out.print("Please enter the value for side 2: ");
 side2=Keyboard.nextDouble();
 System.out.print("Please enter the value for side 3: ");
 side3=Keyboard.nextDouble();
 }
}
public double perimeter(){
 return side1+side2+side3;
}
public void output(){
 System.out.println("The three sides that you entered are:"+side1+" , "+side2+" and "+side3);
 double perimeter=side1+side2+side3;
 System.out.println("The perimeter is "+perimeter);
 if ((side1 == side2) && (side2 == side3)) {
 System.out.println("The Triangle is Equilateral");
 } else {
 System.out.println("The triangle is NOT Equilateral");

 }
 System.out.printf("The area of the Triangle is: %.2f",area());
 }
 public boolean isEquilateral() {
 return true;
 }
 public double area(){
 double S=(side1+side2+side3)/2;
 return Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
 }
}

public class pa07 {
 public static void main(String[] args) {
 Triangle t1=new Triangle();
 t1.input();
 t1.output();
 }
}
