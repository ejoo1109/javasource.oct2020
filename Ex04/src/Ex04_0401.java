
public class Ex04_0401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//��������1.
	int i1 =10;
	int i2= 10;
	int r1 = 2 * ++i1; //��ġ�����������϶� i1�� 1������Ű�� r1�� ���� (2*11=22)
	int r2 = 2 * i2++; //��ġ�����������ϋ� �ϴ� r2=20 ���İ��� 20+1�� ����
	System.out.printf("i1 = %d, i2 = %d, r1 = %d, r2 = %d\n", i1,i2,r1,r2);
}
}