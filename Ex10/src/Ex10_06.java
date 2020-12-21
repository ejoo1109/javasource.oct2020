import java.util.Scanner;

public class Ex10_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		String str1, str2;
		
		System.out.print("byte : ");  a=s.nextByte(); //127
		System.out.print("short : ");  b=s.nextShort();//32767
		System.out.print("int : ");  c=s.nextInt();//2147183647
		System.out.print("long : ");  d=s.nextLong();//9223372036854775807
		System.out.print("float : ");  e=s.nextFloat();//0.1234567
		System.out.print("double : ");  f=s.nextDouble();//0.123456789012345
		System.out.print("str1 : ");  str1=s.next();//Java 보다 1이라도 크면 오류발생
		System.out.print("str2 : ");  str2=s.nextLine();
		
	}

}
