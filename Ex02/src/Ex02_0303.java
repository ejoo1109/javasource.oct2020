import java.io.IOException;
import java.rmi.AccessException;
import java.util.Scanner;

public class Ex02_0303 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");
		int first = s.nextInt();
		System.out.print("+ - * / % ==>");
		char operator = (char)System.in.read();
		System.out.print("�ι��� ����� ���� �Է��ϼ��� ==>");
		int second = s.nextInt();
		int result = 0;
		boolean b = true; //������� �����϶��� ����Ʈ���
		String op;
			if(operator == '+') {
				op = "+";
			result = first + second;
			}
		else if(operator =='-') {
			op = "-";
			result = first - second;
		}
		else if(operator =='*') {
			op = "*";
			result = first * second;
		}
		else if(operator == '/') {
			if(second == 0) {
				System.out.println("0���� ������ �ȵ˴ϴ�.");
				result = 0;
			b = false;
		}
		else 
				result = first / second;
			op = "/";
	}
		else {
			if(second == 0) {
				System.out.println("0���� ������ ������ ���� �ȵ˴ϴ�.");
				result = 0;
			    b = false;
		}
		else
				result = first % second;
		op = "%";
}
if(b == true)
			System.out.println(first + op + second + "=" + result);
	}

}
