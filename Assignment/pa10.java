import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class pa10 {
 public static void main(String[] args) {
 Scanner Keyboard=new Scanner (System.in);
 System.out.print("How many numbers do you want to read? ");
 int number= Keyboard.nextInt();
 Scanner inputstream=null;
 int sum=0;
 String datatxt;
 try{
 inputstream = new Scanner(new File("data.txt"));
 for (int count = 0; count < number && inputstream.hasNextInt(); count++) {
 int num = inputstream.nextInt();
 System.out.println(num);
 sum += num;
 }

 System.out.println("The total is: " + sum);
 }
 catch(FileNotFoundException e)
 {
 System.out.println("Error opening the filestop");
 System.exit(0);
 }


}
}
