package lab_01;
import java.util.Scanner;
public class AreaofTriangle {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Base: ");
	double b=scanner.nextDouble();
	System.out.println("Height: ");
	double h=scanner.nextDouble();
	double Area=(b*h)/2;
	System.out.println("Area of the Traingle is: " +Area);
	
}
}
