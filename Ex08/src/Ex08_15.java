import java.util.Scanner;

public class Ex08_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]queue=new char[5];//5���� ���� �迭
		int rear=0;
		
		char carname='A'; //�� �̸��� a���� ����
		int select=9; // ������ �����Ǽ�������
		
		while(select !=3) {//3�� �ƴϸ� while���� �ݺ��Ѵ�
			System.out.printf("<1> �ֱ� <2> ���� <3> �� : ");
			select = s.nextInt();
			
		 switch (select) {
			 case 1 :
				 if(rear >= 5) {
					 System.out.printf("�ͳ��� �� ���� �� ��\n");
		} else {
			queue[rear] = carname++;
			System.out.printf("%c ���� �ͳο� ��\n",queue[rear]);
			rear++;
		}
				 break;
			 case 2 :
				 if(rear ==0) {
					 System.out.println("�������� �ڵ��� ����\n");
				 } else {
					 System.out.printf("%c ���� �ͳο��� ��������\n",queue[0] );
					 for (int i=0;i<4;i++)
					 queue[i] =queue[i+1];
					 rear--;
				 }
				 break;
			 case 3 :
				 System.out.printf("���� �ͳο� %d �밡 ����\n",rear);
				 System.out.println("���α׷��� �����մϴ�");
				 break;
				 
				 default:
					 System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���\n");
	}
		}
}
}