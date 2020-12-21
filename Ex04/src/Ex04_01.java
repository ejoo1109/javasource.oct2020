
public class Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b = 5;
		int c = 3;
		
		a = b + c;
		System.out.printf("%d + %d = %d \n", b, c, a);
		
		a = b - c;
		System.out.printf("%d - %d = %d \n", b, c, a);
		
		a = b * c;
		System.out.printf("%d * %d = %d \n", b, c, a);
		
		a = b / c; // 정수 나누기 정수로 했으므로 소수점이 안나온다. 소수점 나오게 하려면 실수로 수정해야함
		System.out.printf("%d / %d = %d \n", b, c, a);
		
		a = b % c;
		System.out.printf("%d %% %d = %d \n", b, c, a); //% 입력시 %% 두개로 입력해야함
		
		short s1 = 10;
		short s2 = 20;
		short s3 = (short) (s1 + s2); 
		//s1+s2로 실행하면 정수 int값인데 short로 정의해서 오류발생 앞에 (short) (s1+s2)로 수정해야함
		//=>강제 형 변환
		System.out.println(s3);
		
		float f1 = 20000.0f;
		double d1 = 30000.1234;
		
		//d1 = f1;
		f1 = (float) d1;
		System.out.printf("%f : %f \n",f1,d1);
	}

}
