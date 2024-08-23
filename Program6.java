//import stuff here
import java.util.Scanner;
//Your code here
public class Program6{

public static void main(String[] args) {
Scanner myScanner = new Scanner(System.in);
final double pi = 3.14159;
double radius = 0.0;

System.out.println("Enter the radius:");
System.out.println();
radius = myScanner.nextDouble();

double diameter = radius * 2;
diameter = (int)(diameter * 1000);
diameter +=.5; 
diameter = (int) diameter/1000.0;

double area = pi * (radius * radius);
area = (int)(area * 1000);
area +=.5;
area = (int)area/1000.0;

double circumference = 2 * pi * radius;
circumference = (int)(circumference * 1000);
circumference +=.5;
circumference = (int) circumference/1000.0;

System.out.println();
System.out.println("The Radius of the circle = " + radius);
System.out.println();
System.out.println("The Diameter of the circle = " + diameter);
System.out.println();
System.out.println("The Area of the circle = " + area);
System.out.println();
System.out.println("The Circumference of the circle = " + circumference);


  }
}
//Paste console output below:
/*
Enter the radius:

3.712

The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 43.287

The Circumference of the circle = 23.323

*/
