import java.util.Scanner;

public class Ex09_20 {
//���ڸ� �Ųٷ� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str;
		String str1="";
		int count,i;
		
		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		str=s.nextLine();
		
		count=str.length();
		
		for (i=0; i<count; i++) {
			str1 += str.charAt(count -(i+1));
		}
		
		System.out.printf("������ �Ųٷ� ���==> %s \n",str1);
		
	}

}
