package day2;

public class Relationalandlogical {
	
		public static void main(String[] args) {
			int i=10;
			int j=20;
			
			boolean result=i==j;
			System.out.println(result);
			
			System.out.println(i==j);
			System.out.println(i<j);
			System.out.println(i>j);
			System.out.println(i<=j);
			System.out.println(i>=j);
			System.out.println(i!=j);
			
			boolean b=i<j && i!=10;  
			System.out.println(b);
			boolean bb=i<j || i!=10;  
			System.out.println(bb);
			
    }
}