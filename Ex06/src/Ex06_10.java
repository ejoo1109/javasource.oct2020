import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int total = 0; //�հ� ������ ���������ϰ� 0���� �ʱ�ȭ
		int i,num; // 1�� ������ ������ i�� �����ϰ�, num�� �Է¹��� ���� ����
		
		System.out.printf(" �� �Է� : ");
		num=s.nextInt(); //�Է¹��� ��
		
		for(i=1; i <= num; ++i) { //1���� ����ڰ� �Է��Ѱ����� 1�� ������Ų��
			total = total+i;
		}
		System.out.printf(" 1���� %d������ �հ� : %d \n", num, total);
	}

}
