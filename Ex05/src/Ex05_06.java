import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("������ �Է��ϼ��� : \n");
		a = s.nextInt();
		
		if (a % 2 == 0) { //�Է°��� 2�� ������ �������� 0�̸�(¦���̸�)
			System.out.printf("¦���� �Է��ϼ̱���.\n");//�Է��Ѱ��� ¦���̸� �����
		}
		else {
			System.out.printf("Ȧ���� �Է��ϼ̱���.\n");//�Է��Ѱ��� Ȧ���̸� �����
	
		}
	}

}
