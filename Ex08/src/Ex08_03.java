import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]aa=new int[4];
				Scanner s=new Scanner(System.in);
		int total=0;
		
		for(int i = 0; i < aa.length; ++i) {
			System.out.printf("%d ��° ���ڸ� �Է��ϼ��� : ", i+1);
			aa[i]=s.nextInt();
		}

		for(int i = 0; i < aa.length; ++i) {
			total += aa[i];
		}
		System.out.printf("�հ� : %d \n",total);
		
	}

}
