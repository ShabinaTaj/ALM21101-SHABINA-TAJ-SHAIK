package lab_01;
import java.util.Scanner;
public class NestedSwitchcase{
	public static void main(String[] args){
		int i;
		Scanner input = new Scanner(System.in);
		 i = input.nextInt();
			int j=i%2;
			int k=i%4;
		 switch(j) {
		 case 1:
			 System.out.println("the number is odd"); 
			 break; 
		 case 0:
			 switch (k) {
			 case 1:
				 System.out.println("the number is even and not divisible by 4 - remainder is 1");
				 break;
			 case 2:
				 System.out.println("the number is even and not divisible by 4 - remainder is 2");
				 break;
			 case 0:
				 System.out.println("the number is even and divisible by 4 - remainder is 0");
				 break;
			 }
			 
		 }
		
	}

}
