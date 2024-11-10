import java.util.*;
public class programming03 {
 public static void main(String[] args) {
 //input
 Scanner keyboard=new Scanner(System.in);
 char marble;
 System.out.print("Enter a marble: ");
 marble=keyboard.next().charAt(0);
 int red=0, yellow=0, blue=0, total=0;
 while (marble!='q'&& marble!='Q' ) {
 if (marble=='r'|| marble=='R') {
 red++;
 }
 else if (marble=='y'|| marble=='Y') {
 yellow++;
 }
 else if (marble=='b'|| marble=='B') {
 blue++;
 }
 else {
 System.out.println("INVALID INPUT");
 }
 System.out.print("Enter a marble: ");
 marble=keyboard.next().charAt(0);
 }
 System.out.println("The number of red marbles: " + red);
 System.out.println("The number of yellow marbles: " + yellow);
 System.out.println("The number of blue marbles: " + blue);
 total=red+yellow+blue;
 System.out.println("The Total amount of the marbles: "+total);

 if (red > yellow && red > blue) {
 System.out.println("The winning color is: red");
 } else if (blue > red && blue > yellow) {
 System.out.println("The winning color is: blue");
 } else if (yellow > red && yellow > blue) {
 System.out.println("The winning color is: yellow");
 } else if (red == yellow && red > blue) {
 System.out.println("The winning color is: red");
 } else if (yellow == blue && yellow > red) {
 System.out.println("The winning color is: yellow");
 } else if (red == yellow && yellow == blue) {
 System.out.println("The winning color is: red");
 } else {
 System.out.println("There is no winning color.");
 }
 }
}
