
public class Ex09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Programing";
		String str2 = "Java Programing";
		String str3 = new String("Java Programing");//new �����ڸ� �̿��Ͽ� ���ڿ� �ʱ�ȭ
		
		System.out.println("�� ���ڿ�1 ==> ["+str1+"]");
		System.out.println("�� ���ڿ�2 ==> ["+str2+"]");
		System.out.println("�� ���ڿ�3 ==> ["+str3+"]\n");
		
		System.out.println("���ڿ�1 == ���ڿ�2 ���: \t"+ (str1 == str2));
		System.out.println("���ڿ�1.equals(���ڿ�2) ���: \t"+ str1.equals (str2));
		System.out.println("���ڿ�1 == ���ڿ�3 ���: \t"+ (str1 == str3));
		System.out.println("���ڿ�1.equals(���ڿ�3) ���: \t"+ str1.equals (str3));
	}//str1�� str2�� ���� ���� equals�� true, ==�� ���� ��ġ�� ���Ƽ� true�� ���´�. 
	//str1�� str3�� ���� ���Ƽ� equals �� true ���� ==�� ���� ��ġ�� �ٸ��Ƿ� false�� ��Ÿ����.

}
