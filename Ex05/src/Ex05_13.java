import java.util.Scanner;

public class Ex05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		String[] str;
		
		System.out.printf("수식을 한줄로 한칸씩 띄어쓰기로 입력하세요 : ");
		str=s.nextLine().split(" ");//한줄로 입력 받는데 입력받은 문자열은 공백으로 분리한다.
		
		a = Integer.parseInt(str[0]);//첫번째 글자의 숫자
		ch = str[1].charAt(0);       //두번째 글자의 문자
		b = Integer.parseInt(str[2]);//세번째 글자의 숫자
		
		switch (ch) {
		case '+':
			System.out.printf("%d + %d = %d 입니다. \n", a,b,a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d 입니다. \n", a,b,a-b);
			break;
		case '*':
			System.out.printf("%d * %d = %d 입니다. \n", a,b,a*b);
			break;
		case '/':
			System.out.printf("%d / %d = %f 입니다. \n", a,b,(float)a-b);
			break;
		case '%':
			System.out.printf("%d %% %d = %d 입니다. \n", a,b,a%b);
			break;
			default:
				System.out.printf("연산자를 잘못입력했습니다.");
		}
	}

}
