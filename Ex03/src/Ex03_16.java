import java.util.Scanner;

public class Ex03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요 ==>");
		data = s.nextInt();
		
		System.out.printf("10진수 ==> %d \n", data);
		System.out.printf("16진수 ==> %x \n", data);
		System.out.printf("8진수 ==> %o \n", data);
	}

}
