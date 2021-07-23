package lab_01;
import java.util.Scanner;
public class AreaofSquare {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the side of Square:");
		double a=scanner.nextDouble();
		double area=a*a;
		System.out.println("Area of Square is: "+area);
		
	}

}
