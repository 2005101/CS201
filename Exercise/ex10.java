import java.util.*;
import java.io.*;// to allow us to use File
public class ex10 {
 public static void main(String[] args){
 //loading the dictonary from the file into the array
 Scanner Keyboard=new Scanner (System.in);
 System.out.print ("Enter dictionary file name: ");
 String filename=Keyboard.next(); // next and nextln: next capture everthign until the first space/ nextln captures everthing that the
user inputed in the line.
 // using file as input+ declare an array
 String[]dict =new String[10];// new to create memory space
 Scanner inputstream=null;// declare here to be used everyone as line 14 might not go through
 try{ // to deal with things if they get bad as it is in chapter 9
 inputstream = new Scanner(new File(filename)); // open the file + Scanner to connect to the file and reach it content+ this is chapter
10
 }//Stream is like the straw to connect the box
 catch(FileNotFoundException e)//the e is an object of the data type file not found exception
 {
 System.out.println("Error opening the filestop"+ filename);
 System.exit(0);//this is how to close the program and 0 means the program is closed normally
 }
 int i=0;
 while (inputstream.hasNext()) {
 String word=inputstream.nextLine();
 dict[i]=word;
 //System.out.println(dict[i]);
 i++;
 }
 //PART II Search UI
 while (true) {
 System.out.println("Enter a word: ");
 String target =Keyboard.nextLine();
 if (target.equals ("stop")){// target=="stop" but it will not work for java
 System.out.println("Bye!!");
 break; // or System.exit(0); because they are the same as there is no code after
 }
 //Search for the dict10 for the word in this case it is called target, This is a linear search algorithm
 boolean flag=false;
 for (int j = 0; j < dict.length; j++) {
 if (target.equals(dict[j])) {// This means target is found
 flag=true;
 System.out.println(target+" is found at position "+j);
 }
 }
 if(!flag)// so that it is only printed when the word is not found
 System.out.println(target+"is not found");
 }
 }
}
