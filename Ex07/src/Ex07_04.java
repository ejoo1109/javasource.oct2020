import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		char ch;
		
		while(true) {
			System.out.printf("ù���� ���� �Է��ϼ��� : ");
			a = s.nextInt();
			System.out.printf("�ι��� ���� �Է��ϼ��� : ");
			b = s.nextInt();
			System.out.printf("����� �����ڸ� �Է��ϼ��� (!�Է½� ����) : ");
			ch = (char) System.in.read();
			if(ch == '!') //!�� �����̱� ������ ''�����������
			break;
		
			switch (ch) {
			case '+' :
				System.out.printf("%d + %d = %d\n", a,b,a+b);
			break;
			case '-' :
				System.out.printf("%d - %d = %d\n", a,b,a-b);
			case '*' :
				System.out.printf("%d * %d = %d\n", a,b,a*b);
			break;		
			case '/' :
				System.out.printf("%d / %d = %f\n", a,b,(double)a/b);
			break;
			case '%' :
				System.out.printf("%d %% %d = %d\n", a,b,a%b);
			break;
			default: System.out.printf("�߸� �Է��Ͽ����ϴ�.\n");}


		}
	}

}
