import java.util.Scanner;

public class Ex09_14 {
	
	private static int calc(int o1, int o2, int operator) {
		int result=-1;
		switch(operator) {
		case 1:
			result = o1+ o2;
			break;
		case 2:
			result = o1- o2;
			break;
		case 3:
			result = o1 * o2;
			break;
		case 4:
			if(o2 != 0)
				break;
			result=o1/o2;
			break;
		}
			return result;
			}
		
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.print("��� �Է� (1: +,2: -, 3: *, 4: /) : ");
		int operator =s.nextInt();
		System.out.print("ù��° ���� : ");
		int o1 =s.nextInt();
		System.out.print("�ι�° ���� : ");
		int o2= s.nextInt();
		
		int result= calc(o1,o2,operator);
		System.out.println("��� : " + result);
		
		}
}
