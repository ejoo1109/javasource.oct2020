import java.util.Scanner;

public class Ex04_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		double result;
		Scanner s = new Scanner(System.in);
		System.out.printf("ù��° ����� ���� �Է��ϼ��� ==> \n");
		a=s.nextDouble();
		System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==> \n");
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
