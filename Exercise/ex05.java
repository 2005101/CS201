/**
 * ex05
 */
import java.util.*;
public class ex05{
 public static void main(String[] args) {
 instructions();
 while (true){
 int choice=menu();
 if (choice==3)
 System.exit(0);
 else if (choice==1|| choice==2)
 draw_shape(choice);
 else
 System.out.println("Invalid Input!");
 }
 }
 //method 1
 public static void instructions(){
 System.out.println("We want to create a program that draws a diamond or a triangle with a size that the user selects\"\r\n" + //
 " using a specific character that will be entered at the keyboard.");
 }
 //method 2
 public static int menu(){
 System.out.println("1/ draw a traingle");
 System.out.println("2/ draw a diamond ");
 System.out.println("3/ quit ");
 Scanner keyboard= new Scanner(System.in);
 System.out.print("Enter a choice: ");
 int choice= keyboard.nextInt();
 return choice;
 }
 //method 3
 public static void draw_shape(int choice){
 int size=get_size();
 char c=get_char();
 if (choice==1){
 System.out.println(" Draw triangle ");
 draw_triangle(size,c);
 }
 else if (choice==2){
 System.out.println(" Draw diamond");
 draw_diamond(size,c);
 }
 }
 //method 4
 public static int get_size(){
 Scanner keyboard= new Scanner(System.in);
 System.out.print("Enter the size: ");
 int size= keyboard.nextInt();
 return size;
 }
 //method 5
 public static char get_char(){
 Scanner keyboard= new Scanner(System.in);
 System.out.print("Enter the char: ");
 char c= keyboard.next().charAt(0);
 return c;
 }
 //method 6
 public static void draw_triangle(int size, char c)
 {
 size++;
 for( int i=0; i< size; i++) //2 inner loop into one outter loop
 {
 for(int j=0; j< size-i-1; j++) // padding spaces
 System.out.print(" ");
 for(int k=0; k<2*i-1;k++) //display the actual c: do the graph, j is for the space padded and k is for the char
 System.out.print(c);
 System.out.println();
 }
  }
 //method 7
 public static void draw_diamond(int size,char c){
 draw_triangle(size,c);
 draw_bottom(size,c);
 }
 //method 8
 public static void draw_bottom(int size, char c) //not sure if we are done with this one or not yet
 {
 for( int i=0; i< size-1; i++) //2 inner loop into one outter loop
 {
 for(int j=0; j<i+1; j++) // padding spaces
 System.out.print(" ");
 for(int k=0; k<2*(size-1-i)-1;k++) //display the actual c: do the graph, j is for the space padded and k is for the char
 System.out.print(c);
 System.out.println();
 }
 }
} 
