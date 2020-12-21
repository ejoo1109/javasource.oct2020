import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("정수를 입력하세요 : \n");
		a = s.nextInt();
		
		if (a % 2 == 0) { //입력값을 2로 나누어 나머지가 0이면(짝수이면)
			System.out.printf("짝수를 입력하셨군요.\n");//입력한값이 짝수이면 실행됨
		}
		else {
			System.out.printf("홀수를 입력하셨군요.\n");//입력한값이 홀수이면 실행됨
	
		}
	}

}
