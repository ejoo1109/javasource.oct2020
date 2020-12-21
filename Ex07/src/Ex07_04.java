import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		char ch;
		
		while(true) {
			System.out.printf("첫번쨰 수를 입력하세요 : ");
			a = s.nextInt();
			System.out.printf("두번쨰 수를 입력하세요 : ");
			b = s.nextInt();
			System.out.printf("계산할 연산자를 입력하세요 (!입력시 종료) : ");
			ch = (char) System.in.read();
			if(ch == '!') //!가 문자이기 때문에 ''지정해줘야함
			break;
		
			switch (ch) {
			case '+' :
				System.out.printf("%d + %d = %d\n", a,b,a+b);
			break;
			case '-' :
				System.out.printf("%d - %d = %d\n", a,b,a-b);
			case '*' :
				System.out.printf("%d * %d = %d\n", a,b,a*b);
			break;		
			case '/' :
				System.out.printf("%d / %d = %f\n", a,b,(double)a/b);
			break;
			case '%' :
				System.out.printf("%d %% %d = %d\n", a,b,a%b);
			break;
			default: System.out.printf("잘못 입력하였습니다.\n");}


		}
	}

}
