
public class Ex04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 'A', b;
		byte mask = 0x0F;//16������ 0��F�̱� ������ 0F: 0000 1111 �̴�
		
		System.out.printf(" %X & %X = %X \n", a, mask, a & mask);
		System.out.printf(" %X | %X = %X \n", a, mask, a | mask);
		
		mask = 'a' - 'A'; //mask�� ����ε�ó�� a-A�� ���̴� 32�̴�.
		
		b = (byte) (a ^ mask);
		System.out.printf(" %c ^ %d = %c \n", a, mask, b);
		a = (byte) (b ^ mask);
		System.out.printf(" %c ^ %d = %c \n", b, mask, a);
		
	}

}
