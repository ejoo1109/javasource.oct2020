
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
		
		a = b / c; // ���� ������ ������ �����Ƿ� �Ҽ����� �ȳ��´�. �Ҽ��� ������ �Ϸ��� �Ǽ��� �����ؾ���
		System.out.printf("%d / %d = %d \n", b, c, a);
		
		a = b % c;
		System.out.printf("%d %% %d = %d \n", b, c, a); //% �Է½� %% �ΰ��� �Է��ؾ���
		
		short s1 = 10;
		short s2 = 20;
		short s3 = (short) (s1 + s2); 
		//s1+s2�� �����ϸ� ���� int���ε� short�� �����ؼ� �����߻� �տ� (short) (s1+s2)�� �����ؾ���
		//=>���� �� ��ȯ
		System.out.println(s3);
		
		float f1 = 20000.0f;
		double d1 = 30000.1234;
		
		//d1 = f1;
		f1 = (float) d1;
		System.out.printf("%f : %f \n",f1,d1);
	}

}
