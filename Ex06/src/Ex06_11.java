import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int total = 0; //�հ� ������ ���������ϰ� 0���� �ʱ�ȭ
		int i,num1,num2,num3; // 3�� ������ ������ i�� �����ϰ�, num1,num2,num3�� �Է¹��� ���� ����
		
		System.out.printf(" ���۰� �Է� : ");
		num1=s.nextInt(); //�Է¹��� ��
		
		System.out.printf(" ���� �Է� : ");
		num2=s.nextInt(); //�Է¹��� ��
		
		System.out.printf(" ������ �� �Է� : ");
		num3=s.nextInt(); //���ϱ� �Ǵ� ���� �Է�
		
		for(i=num1; i <= num2; i=i+num3) { //1���� ����ڰ� �Է��Ѱ����� 3�� ������Ų��
			total = total+i;
		}
		System.out.printf(" %d���� %d���� %d�� ������ ���� �հ� : %d \n", num1,num2,num3, total);
	}

}
