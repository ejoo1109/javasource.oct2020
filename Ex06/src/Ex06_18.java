import java.util.Scanner;

public class Ex06_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		
		for(;;) {//���ѹݺ�
			System.out.printf("���� ù ���� �� : ");
			a=s.nextInt();
			System.out.printf("���� �ι�° �� : ");
			b=s.nextInt();
			System.out.printf("%d + %d =%d \n",a,b,a+b);//������� ���
		}
	}

}
