
public class Overload {
	public static void main(String[] args) {
		int i = 30;
		float f = (float)30.2;
		double d = 33.3;
		i = getMul(i);
		System.out.println(i);
		f = getMul(f);
		System.out.println(f);
		d = getMul(d);
		System.out.println(d);
		
		int result1, result2;
		double result3;
		result1 = add(100, 200);
		result2 = add(10, 20, 30);
		result3 = add(3.14159, 2.54);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
	public static int getMul(int i) {
		return i * i;
	}
	public static float getMul(float f) {
		return f * f;
	}
	public static double getMul(double d) {
		return d * d;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static double add(double a, double b) {
		return a + b;
	}
}
