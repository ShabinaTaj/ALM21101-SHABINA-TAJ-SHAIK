package day2;

public class casting {
	public static void main(String[] args) {

	byte b=10;
	short s=b;
	int i=s;
	long l=i;
	
	
	
	long ll=257;
	System.out.println("long value..:"+ll);
	int ii=(int)ll;
	System.out.println("int value...:"+ii);
	short ss=(short)ii;
	System.out.println("short value...:"+ss);
	byte bb=(byte)ss;
	System.out.println("byte value....:"+bb);
	
	double d=23.45;
	System.out.println("double value..:"+d);
	float f=(float)d;
	System.out.println("float value..:"+f);
	
	int myint=(int)f;
	System.out.println(myint);
	
	int myascii=169;
	char mychar=(char)myascii;
	System.out.println((char)169);
	System.out.println(mychar);
	
	int mmm=0;
	System.out.println(mmm);
}
}