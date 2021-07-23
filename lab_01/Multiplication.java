package lab_01;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("First value...i:");
		
		int i=scan.nextInt();
		
		System.out.println("Second value...j:");
		
		int j=scan.nextInt();
		
		int mul=i*j;
		
		System.out.println("The Multiplication of i and j is..:"+mul);
		
	}

}
