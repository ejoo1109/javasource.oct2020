import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("��������� �Է��ϼ��� : ");
		a=s.nextInt();
		
		switch (a % 12) {
		case 0 : System.out.printf("�����̶�\n");//��������� 12�� ���� ���������� �������� 0~9����
		break;
		case 1 : System.out.printf("�߶�\n");
		break;
		case 2 : System.out.printf("����\n");
		break;
		case 3 : System.out.printf("������\n");
		break;
		case 4 : System.out.printf("���\n");
		break;
		case 5 : System.out.printf("�Ҷ�\n");
		break;
		case 6 : System.out.printf("ȣ���̶�\n");
		break;
		case 7 : System.out.printf("�䳢��\n");
		break;
		case 8 : System.out.printf("���\n");
		break;
		case 9 : System.out.printf("���\n");
		break;
		case 10 : System.out.printf("����\n");
		break;
		case 11 : System.out.printf("���\n");
		break;
		}
	}

}
