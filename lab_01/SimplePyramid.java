package lab_01;

public class SimplePyramid {

	public static void main(String[] args) {
	
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
        
	}
}
