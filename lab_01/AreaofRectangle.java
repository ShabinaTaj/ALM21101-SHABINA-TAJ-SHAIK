package lab_01;
import java.util.Scanner;
public class AreaofRectangle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length of the Rectangle:");
	int l=scanner.nextInt();
	
	System.out.println("Enter the breadth of the Recdtangle:");
	int b=scanner.nextInt();
	
	int Area=l*b;
	System.out.println("Area of the Rectangle is: "+Area);
	
}
}
