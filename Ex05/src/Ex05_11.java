import java.util.Scanner;

public class Ex05_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		System.out.printf("ù���� ���� �Է��ϼ��� : ");
		a = s.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		ch = s.next().charAt(0);
		
		System.out.printf("�ι��� ���� �Է��ϼ��� : ");
		b = s.nextInt();
		
		if (ch == '+')
			System.out.printf("%d + %d = %d, \n", a,b,a+b);
		if (ch == '-')
			System.out.printf("%d + %d = %d, \n", a,b,a-b);
		if (ch == '*')
			System.out.printf("%d + %d = %d, \n", a,b,a*b);
		if (ch == '/')
			System.out.printf("%d + %d = %f, \n", a,b,(float)a/b);
		if (ch == '%')
			System.out.printf("%d + %d = %d, \n", a,b,a%b);
		
	}

}
