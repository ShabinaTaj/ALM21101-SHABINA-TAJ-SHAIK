package lab_01;
import java.util.Scanner;
public class CircumferenceoftheCircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Radius of the circle: ");
		double r= scanner.nextDouble();
		double circum= Math.PI*(2*r);
		System.out.println("The Circumference of the circle is: "+circum);

	}


}
