import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]stack=new char[5];//5���� ���� �迭
		int top=0;
		
		char carname='A'; //�� �̸��� a���� ����
		int select=9; // ������ �����Ǽ�������
		
		while(select !=3) {//3�� �ƴϸ� while���� �ݺ��Ѵ�
			System.out.printf("<1> �ֱ� <2> ���� <3> �� : ");
			select = s.nextInt();
			
		 switch (select) {
			 case 1 :
				 if(top >= 5) {
					 System.out.printf("�ͳ��� �� ���� �� ��\n");
		} else {
			stack[top] = carname;
			System.out.printf("%c ���� �ͳο� ��\n",stack[top]);
			top++;
		}
				 break;
			 case 2 :
				 if(top ==0) {
					 System.out.println("�������� �ڵ��� ����\n");
				 } else {
					 top--;
					 System.out.printf("%c ���� �ͳο��� ��������\n",stack[top]);
					 stack[top]=' ' ;
				 }
				 break;
			 case 3 :
				 System.out.printf("���� �ͳο� %d �밡 ����\n",top);
				 System.out.println("���α׷��� �����մϴ�");
				 break;
				 default:
					 System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
				 }
		 }
			
		}
	}


