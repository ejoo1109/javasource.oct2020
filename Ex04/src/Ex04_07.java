
public class Ex04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = -200;
		
		boolean a = (num1 != 0); //num1�� 0�� �����ʴٿ� ���� ��/���� ���а��� �����
		boolean b = (num2 != 0); //num2�� 0�� �����ʴٿ� ���� ��/���� ���а��� �����
		
		System.out.printf("%s \n", a && b); //a = ���� b = �� �̹Ƿ� true
		System.out.printf("%s \n", a || b); // a=�� �Ǵ� b=�� �̹Ƿ� true
		System.out.printf("%s \n", !a); // a=���� �ƴϴٸ� �������� ǥ���ϹǷ� false�� ��µ�
		
		
	}

}
