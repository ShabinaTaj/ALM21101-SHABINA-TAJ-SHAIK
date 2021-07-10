package day2;
import java.util.Scanner;
public class conditional {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a number..:");
			int x=scan.nextInt();
			
			if(x%2==0) {
				System.out.println("Even Number...");
			}
			else {
				System.out.println("Odd Number......");
			}
			
			
			System.out.println((x%2==0)?"Even number...teeeee":"odd number....teee");
			
			switch(x%2) 
			{
				case 0:{
					System.out.println("Even number.....sc");
					break;
				}
				case 1:{
					System.out.println("Odd Number......sc");
					break;
				}
			}
		}
	}


