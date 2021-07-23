package lab_01;

import java.util.Scanner;

public class Reversenumber {
	
	public static void main(String args[]) 
	 { 
		System.out.println("Enter the number that should be reversed:");
		Scanner scan=new Scanner(System.in);
		
		int s=0;
		int reverse=0	;
	
		s= scan.nextInt();
		while(s!=0) {
			int remainder=s%10;
			reverse= reverse*10+remainder;
			s=s/10;
		}
		System.out.println("Enter the number that should be reversed:"+reverse);
	 } 
	} 

