
public class Ex04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		
		System.out.printf("%s \n", (a >= 100) && (a <=200)); //AND ����: �Ѵ� ���̰ų� �Ѵ� ����
		//a�� 100���� ũ�ų� ���� 200���� �۰ų� ����. ��&&�����̹Ƿ� ������� false 
		System.out.printf("%s \n", (a >=100) || (a <=200)); //OR ����: ���� �ϳ��� ���̾ true
		//a�� 100���� ũ�� �Ǵ� 200���� �۰ų� ����. ����||���̹Ƿ� ������� true
		System.out.printf("%s \n", !(a == 100)); // NOT ����:���̸� �����̰� �����̸� ������ ǥ��
		//a�� 100�� ����. ���������� not�� �ٿ��� ������� true
	}

}
