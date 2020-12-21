
public class Ex04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 'A', b;
		byte mask = 0x0F;//16진수의 0과F이기 떄문에 0F: 0000 1111 이다
		
		System.out.printf(" %X & %X = %X \n", a, mask, a & mask);
		System.out.printf(" %X | %X = %X \n", a, mask, a | mask);
		
		mask = 'a' - 'A'; //mask는 블라인드처리 a-A의 차이는 32이다.
		
		b = (byte) (a ^ mask);
		System.out.printf(" %c ^ %d = %c \n", a, mask, b);
		a = (byte) (b ^ mask);
		System.out.printf(" %c ^ %d = %c \n", b, mask, a);
		
	}

}
