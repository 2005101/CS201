import java.util.Scanner;
public class Time{
 //data fields
 private int year;
 private int month;
 private int day;
 private int hour;
 private int minute;
 private int second;
 //methods
 public void input()
 {
 // This is inputed in military time: 24 h
 Scanner Keyboard=new Scanner(System.in);
 System.out.print("Enter year: ");
 year=Keyboard.nextInt();
 System.out.print("Enter month: ");
 month=Keyboard.nextInt();
 System.out.print("Enter day : ");
 day=Keyboard.nextInt();
 System.out.print("Enter hour in Military time: ");
 hour=Keyboard.nextInt();
 System.out.print("Enter minute : ");
 minute=Keyboard.nextInt();
 System.out.print("Enter second: ");
 second=Keyboard.nextInt();
 while (hour<0 || hour>23 || minute<0 || minute>59 ||second<0 || second>59) {
 System.out.println("Entry is not valid");
 System.out.print("Enter year: ");
 year=Keyboard.nextInt();
 System.out.print("Enter month: ");
 month=Keyboard.nextInt();
 System.out.print("Enter day : ");
 day=Keyboard.nextInt();
 System.out.print("Enter hour in Military time: ");
 hour=Keyboard.nextInt();
 System.out.print("Enter minute : ");
 minute=Keyboard.nextInt();
 System.out.print("Enter second: ");
 second=Keyboard.nextInt();
 }
 }
//Standard time
public void PrintStandardTime()
{
 if (hour>12){
 int period=hour-12;
 System.out.println("Based on your entry, the Standard time is "+month+"-"+day+"-"+year+","+period+":"+minute+":"+second+" PM");
 }
 else if (hour<12){
 System.out.println("Based on your entry, the Standard time is "+month+"-"+day+"-"+year+","+hour+":"+minute+":"+second+" AM");
 }
}
//we assume that the input is already in Military time
public void PrintMilitaryTime()
{
 System.out.println("Based on your entry, the Military time is "+day+"-"+month+"-"+year+","+hour+":"+minute+":"+second);
}
}

public class ex06 {
 public static void main(String[] args) {
 Time t1=new Time();
 //t1.print();
 t1.input();
 t1.PrintStandardTime();
 t1.PrintMilitaryTime();
 }
}
