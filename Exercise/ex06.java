import java.util.Scanner;
public class Time{
 //data fields
 private int hour;
 private int minute;
 private int second;
 //methods
 public void input()
 {
 Scanner Keyboard=new Scanner(System.in);
 System.out.print("Enter hour: ");
 hour=Keyboard.nextInt();
 System.out.print("Enter minute: ");
 minute=Keyboard.nextInt();
 System.out.print("Enter second: ");
 second=Keyboard.nextInt();
 }
 public void print()
 {
 System.out.println(hour+":"+minute+":"+second);
 }
}
public class ex06 {
 public static void main(String[] args) {
 Time t1=new Time();
 t1.print();
 t1.input();
 t1.print();
 }
}
