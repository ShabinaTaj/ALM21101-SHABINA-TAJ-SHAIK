package lab_01;

public class Swaptwono {
	public static void main(String[] args) {
		double a=123.950698867645455434345, b=150.3777777873244557687f;
		System.out.println("----Before swap----");
		System.out.println("1st number = " +a);
		System.out.println("2nd number = " +b);
		double temporary=a;
		a=b;
		b=temporary;
		
		System.out.println("----After swap----");
		System.out.println("1st number = " +a);
		System.out.println("2nd number = " +b);
	}

}
