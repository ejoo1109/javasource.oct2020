import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]aa=new int[4]; //�迭�� ����
				Scanner s=new Scanner(System.in);
		int total;
		
		System.out.printf("1���� ���ڸ� �Է��ϼ��� : ");//�� �迭�� ���ڸ� �Է��Ѵ�
		aa[0] = s.nextInt();
		System.out.printf("2���� ���ڸ� �Է��ϼ��� : ");
		aa[1] = s.nextInt();
		System.out.printf("3���� ���ڸ� �Է��ϼ��� : ");
		aa[2] = s.nextInt();
		System.out.printf("4���� ���ڸ� �Է��ϼ��� : ");
		aa[3] = s.nextInt();

		total = aa[0]+aa[1]+aa[2]+aa[3]; //�� �迭�� ����� ���ڸ� ���Ѵ�.
		
		System.out.printf("�հ� : %d \n",total);
		
	}

}
