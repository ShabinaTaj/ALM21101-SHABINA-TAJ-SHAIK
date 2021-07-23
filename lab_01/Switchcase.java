package lab_01;
import java.util.Scanner;

public class Switchcase {
	public static void main(String args[]) {
		 int num;
		 System.out.println("Enter the interger value");
	 Scanner input=new Scanner(System.in);
	 num = input.nextInt();
	 int x=num%2;
	 switch(x){ 
	case 0: 
	 { 
	 System.out.println("Number is even"); 
	 break; 
	 } 
	 case 1:{ 
	 System.out.println("Number is odd"); 
	 break; 
	 } 
	 default:{ 
	 System.out.println("Not a correct number."); 
	 } 
	 }
}}
