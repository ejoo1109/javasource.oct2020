import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ����� ���� �Է��ϼ��� ==>");
		int a = s.nextInt();
		System.out.println("�ι��� ����� ���� �Է��ϼ��� ==>");
		int b = s.nextInt();
		System.out.println("������ ����� ���� �Է��ϼ��� ==>");
		int c = s.nextInt();
		
		int result = a + b + c ;
		System.out.println(a + "+" + b + "+" + c + "=" + result);

		int result1 = a * b * c;
		System.out.println(a + "*" + b + "*" + c + "=" + result1);
		
		int result2 = a - b - c;
		System.out.println (a + "-" + b + "-" + c + "=" + result2);
		
	}

}
