import java.util.Scanner;

public class Ex04_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		double result;
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> \n");
		a=s.nextDouble();
		System.out.printf("두번째 계산할 값을 입력하세요 ==> \n");
		b=s.nextDouble();
		
		result = a + b;
		System.out.printf("%5.2f + %5.2f = %5.2f \n",a,b,result);
		
		result = a - b;
		System.out.printf("%5.2f - %5.2f = %5.2f \n",a,b,result);	
		
		result = a * b;
		System.out.printf("%5.2f * %5.2f = %5.2f \n",a,b,result);
		
		result = a / b;
		System.out.printf("%5.2f / %5.2f = %5.2f \n",a,b,result);
		
		result = (int)a % (int)b;
		System.out.printf("%d %% %d = %d \n",(int)a,(int)b,(int)result);
	}

}
