import java.util.Scanner;

public class Ex02_0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ����� ���� �Է��ϼ��� ==>");
		int a = s.nextInt();
		System.out.println("�ι��� ����� ���� �Է��ϼ��� ==>");
		int b = s.nextInt();
		System.out.println("������ ����� ���� �Է��ϼ��� ==>");
		int c = s.nextInt();
		System.out.println("�׹��� ����� ���� �Է��ϼ��� ==>");
		int d = s.nextInt();
		
		int result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

		int result1 = a * b * c * d;
		System.out.println(a + "*" + b + "*" + c + "*" + d + "=" + result1);
		
		int result2 = a - b - c - d;
		System.out.println (a + "-" + b + "-" + c + '-'+ d + "=" + result2);
		
	}

}
