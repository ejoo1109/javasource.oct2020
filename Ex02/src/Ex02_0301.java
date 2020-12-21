import java.util.Scanner;

public class Ex02_0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요 ==>");
		int a = s.nextInt();
		System.out.println("두번쨰 계산할 값을 입력하세요 ==>");
		int b = s.nextInt();
		System.out.println("세번쨰 계산할 값을 입력하세요 ==>");
		int c = s.nextInt();
		System.out.println("네번쨰 계산할 값을 입력하세요 ==>");
		int d = s.nextInt();
		
		int result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

		int result1 = a * b * c * d;
		System.out.println(a + "*" + b + "*" + c + "*" + d + "=" + result1);
		
		int result2 = a - b - c - d;
		System.out.println (a + "-" + b + "-" + c + '-'+ d + "=" + result2);
		
	}

}
