
public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 4;
		
		int result1;
		int mok;
		int namugi;
		float result2; //double도 가능
		
		result1 = a + b - c;
		System.out.printf("%d + %d - %d = %d\n", a, b, c, result1);
		
		result1 = a + b + c;
		System.out.printf("%d + %d + %d = %d\n", a, b, c, result1);
		
		result1 = a + b * c; //*곱하기 /나누기가 먼저 계산되고 +가 나중에 계산됨
		System.out.printf("%d + %d * %d = %d\n", a, b, c, result1);
		
		result2 = a * b / (float) c;//정수형 c를 실수로 강제형변환 한다
		System.out.printf("%d * %d / %d = %f\n", a, b, c, result2);
		
		mok = c / b;
		System.out.printf("%d / %d = %d\n", c, b, mok);
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d\n", c, b, namugi);
		
		
		
	}

}
