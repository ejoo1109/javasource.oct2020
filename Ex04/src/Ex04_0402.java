
public class Ex04_0402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������2.
		int i3 =10;
		int i4= 10;
		int r3 = 2 * i3++; //��ġ�����ϱ� r3=2*10 �ϴ� r3=20 �̴� ���� ���� r3=20+1�� �Ѿ
		int r4 = 2 * ++i4; //��ġ�����ϱ� r4=2*11 r4=22
		int r5 = r3+1;
		System.out.printf("i3 = %d, i4 = %d, r3 = %d, r4 = %d\n", i3,i4,r3,r4);
		System.out.printf("r3 + 1 = %d \n", r5);
	}

}
