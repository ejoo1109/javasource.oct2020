import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str, strRep, strSub;
		
		System.out.print("���ڿ��� �Է��ϼ��� ==> ");
		str=s.nextLine();
		
		strRep = str.replace(" ","$");
		strSub = str.substring (3,8);
		String Ary1 []= str.split(" ");//�迭�� ��������.. []�ȿ� ���� �������� ������ �ܾ �迭�� ��
		
		System.out.println("�Է� ���ڿ� ==> "+str);
		System.out.println("�ٲ� ���ڿ� ==> "+strRep);
		System.out.println("���� ���ڿ� ==> "+strSub);
		for(int i =0;i<Ary1.length; i++) //���ǽ� 
			System.out.println("�и��� ���ڿ� ==> "+Ary1[i]);//Ary1�� i�迭
	}

}
