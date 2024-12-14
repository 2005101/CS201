import java.util.*;
public class ex08 {
 public static void main(String[] args) {
 Scanner keyboard=new Scanner(System.in);
 System.out.print("Enter ten numbers: ");
 int[] a=new int[10];
 for (int i= 0; i<a.length; i++) {
 a[i]=keyboard.nextInt();
 }
 System.out.println("The maximum number is: "+max(a));
 System.out.print("The sorted numbers: ");
 int[]b=new int[a.length];
 b=sort(a);
 for (int i= 0; i<b.length; i++) {
 System.out.print(b[i]+" ");
 }
 }
 public static int max(int[] array){
 int largest_so_far=array[0];
 for (int i= 0; i< array.length; i++) {
 if (array[i]>largest_so_far){ // you change the sign here if you want the smallest function
 largest_so_far=array[i];
 }
 }
 return largest_so_far;
 }
 public static int[] sort(int[] array){ // The sort is for the sequence as it is sorted but also as an integer array
 int[] result=new int[array.length];
 int i,j,index=0;
 for (i = 0; i < result.length; i++) {// this loop will fill each element in result array.
 int smallest=Integer.MAX_VALUE;
 for (j= 0; j< array.length; j++) {// find the next samllest value in an array
 if (array[j]<smallest){ // you change the sign here if you want the smallest function
 smallest=array[j];
 index=j; // remember where we found the smallest value
 }
 }
 result[i]=smallest;
 array[index]=Integer.MAX_VALUE;// cross out the smallest value used from the array
 }
 return result;
}
}
