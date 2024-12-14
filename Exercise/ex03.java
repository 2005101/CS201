public class ex03 {
 public static void main(String[] args) {
 int counter=0;
System.out.println("Celsius\t\tFahrenheit "); // t gives space i guess
 while (counter<=20) {
 // loop body
 double ftemp= 1.8*counter+32;
 System.out.printf("%d\t\t%.1f\n",counter,ftemp); //%d integer review format specifier\ n is the line spacer to get a new line
 //System.out.println();
 counter++;
 }
 }
}
