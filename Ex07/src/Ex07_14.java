import java.util.Scanner;

public class Ex07_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start, end;
		int basu,i;//�������
		int hap = 0;
		
		System.out.printf("�հ��� ���۰� ==>");
		start = s.nextInt();
		System.out.printf("�հ��� ���� ==>");
		end = s.nextInt();
		System.out.printf("��� ==> ");
		basu = s.nextInt();
		
		i = start;
		while (i <= end) {
			if (i % basu == 0)
				hap = hap + i;
			
			i++;
		}
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n", start,end,basu,hap);
		
	}

}
