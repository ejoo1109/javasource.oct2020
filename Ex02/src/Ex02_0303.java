import java.io.IOException;
import java.rmi.AccessException;
import java.util.Scanner;

public class Ex02_0303 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		int first = s.nextInt();
		System.out.print("+ - * / % ==>");
		char operator = (char)System.in.read();
		System.out.print("두번쨰 계산할 값을 입력하세요 ==>");
		int second = s.nextInt();
		int result = 0;
		boolean b = true; //결과값이 정답일때만 프린트출력
		String op;
			if(operator == '+') {
				op = "+";
			result = first + second;
			}
		else if(operator =='-') {
			op = "-";
			result = first - second;
		}
		else if(operator =='*') {
			op = "*";
			result = first * second;
		}
		else if(operator == '/') {
			if(second == 0) {
				System.out.println("0으로 나누면 안됩니다.");
				result = 0;
			b = false;
		}
		else 
				result = first / second;
			op = "/";
	}
		else {
			if(second == 0) {
				System.out.println("0으로 나누면 나머지 값이 안됩니다.");
				result = 0;
			    b = false;
		}
		else
				result = first % second;
		op = "%";
}
if(b == true)
			System.out.println(first + op + second + "=" + result);
	}

}
