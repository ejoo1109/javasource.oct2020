import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int menu;
		
		do {
			System.out.printf("�մ� �ֹ��Ͻðھ��?\n");
			System.out.printf("<1>ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� =>");
			
			menu=s.nextInt();
			
			switch (menu) {
				case 1 :
					System.out.printf("#ī��� �ֹ��ϼ̽��ϴ�.\n"); 
				break;
				case 2 :
					System.out.printf("#īǪġ�� �ֹ��ϼ̽��ϴ�.\n"); 
				break;
				case 3 :
					System.out.printf("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.\n"); 
				break;
				case 4 :
					System.out.printf("#�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.\n"); 
				break;
				default:
					System.out.printf("�߸� �ֹ��ϼ̽��ϴ�.\n");
			}
		}while (menu != 4);
		}
}