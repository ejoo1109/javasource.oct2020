
public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA �����ϴ���~JAVA �� ��վ��~";
		
		System.out.println("���ڿ� ==> "+str);
		
		System.out.print("���� ó�� ������ JAVA ��ġ ==> ");
		System.out.println(str.indexOf("JAVA"));
		
		System.out.print("�������� ������ JAVA ��ġ ==> ");
		System.out.println(str.lastIndexOf("JAVA"));
	}

}