package lab_01;

public class Largestnumber {

	public static void main(String[] args){

	double a=-1, b=0, c=2, d=-2.5;
	
	if (a>=b && a>=c && a>=d)
		
		System.out.println(a+" is the largest number among three.");
	
	else if(b>=a && b>=c && b>=d)
		
		System.out.println(b+" is the largest number among three.");

	else if (c>=a && c>=b && c>=d)
		
		System.out.println(c+" is the largest number among three.");
	else
		
		System.out.println(d+" is the largest number among three.");
	
	}
}
