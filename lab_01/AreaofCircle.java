package lab_01;
import java.util.Scanner;
public class AreaofCircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Radius of the circle: ");
		double r= scanner.nextDouble();
		double area= Math.PI*(r*r);
		System.out.println("The Area of the circle is: "+area);

	}

}
