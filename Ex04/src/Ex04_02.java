
public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 4;
		
		int result1;
		int mok;
		int namugi;
		float result2; //double�� ����
		
		result1 = a + b - c;
		System.out.printf("%d + %d - %d = %d\n", a, b, c, result1);
		
		result1 = a + b + c;
		System.out.printf("%d + %d + %d = %d\n", a, b, c, result1);
		
		result1 = a + b * c; //*���ϱ� /�����Ⱑ ���� ���ǰ� +�� ���߿� ����
		System.out.printf("%d + %d * %d = %d\n", a, b, c, result1);
		
		result2 = a * b / (float) c;//������ c�� �Ǽ��� ��������ȯ �Ѵ�
		System.out.printf("%d * %d / %d = %f\n", a, b, c, result2);
		
		mok = c / b;
		System.out.printf("%d / %d = %d\n", c, b, mok);
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d\n", c, b, namugi);
		
		
		
	}

}
