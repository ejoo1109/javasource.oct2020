
public class Main {

	public static void main(String[] args) {
		int i1 = 20;
		int i2 = 6;
		int i3 = i1 % i2;
		System.out.println(i3);
		short s1 = 10;
		short s2 = 100;
		short s3 = (short)(s1 + s2);
		System.out.println(s3);
		String str = "첫번째 문자열" + "두번째 문자열";
		System.out.println(str);
		int i = 100;
		i = -i;
		System.out.println(i);
		int x = 10;
		x *= 2;
		System.out.println(x);
		i = 100;
		++i;
		System.out.println(i);
		--i;
		System.out.println(i);
		i1 = 10;
		i2 = 10;
		int r1 = 2 * ++i1;
		int r2 = 2 * i2++;
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", r1 = " + r1 + ", r2 = " + r2);
		x = 10;
		int y = 100;
		boolean b = x == y;
		System.out.println(b);
		x = 3;
		y = 4;
		int max = x > y ? ++x : ++y;
		System.out.println("max = " + max + ", x = " + x + ", y = " + y);
		boolean t = true;
		boolean f = !t;
		System.out.println(f);
		int a1 = 10;
		int b1 = 20;
		x = 100;
		y = 200;
		boolean result = (++a1 > ++b1) && (++x < ++y);
		System.out.println("result = " + result + ", a1 = " + a1 + ", b1 = " + b1 + ", x = " + x + ", y = " + y);
		
	}

}
