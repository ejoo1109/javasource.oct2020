import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� ===>");
		str=s.nextLine();
		
		System.out.print("����� ���� ==> ");
		
		if(!str.startsWith("("));
		System.out.printf("(");
		
		for (int i = 0; i<str.length();i++)
			System.out.printf("%c",str.charAt(i));
		
		if (!str.endsWith(")"));
			System.out.printf(")");
		
	}

}
