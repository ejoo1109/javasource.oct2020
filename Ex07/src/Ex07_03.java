import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		
		while(true) {//���ǽ��� ���ϋ� ���ѷ���
			System.out.printf("���ϱ��� ù ���� �� : ");
			a = s.nextInt();
			System.out.printf("���ϱ��� �� ��° �� : ");
			b = s.nextInt();
			
			System.out.printf("%d + %d = %d \n",a,b,a+b);
		}
	}

}
