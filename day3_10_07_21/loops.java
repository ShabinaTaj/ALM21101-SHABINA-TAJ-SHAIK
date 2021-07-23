package day3_10_07_21;

public class loops {
		public static void main(String[] args) {
			int x=10;
			
			while(x>0) {// pre condition check...
				if(x%2==0) {
					System.out.println("Even number......."+x);
				}
				else {
					System.out.println("odd number.........................."+x);
				}
				--x;
			}
			
			x=10;
			
			do {//post condition check...
				String s=(x%2==0)?"Even Number..."+x:"Odd Number....."+x;
				System.out.println(s);
				--x;
			}while(x>0);

		}

}
