import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("1 ~ 4 중에 선택하세요 :");
		a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.printf("1을 선택했다\n");//a를 1로 입력했을떄 실행됨
			break; //break를 넣어 case1를 빠져나옴
		case 2:
			System.out.printf("2을 선택했다\n");
			break;
		case 3:
			System.out.printf("3을 선택했다\n");
			break;
		case 4:
			System.out.printf("4을 선택했다\n");
			break;
			default:
				System.out.printf("잘못입력했습니다.\n");//a가 1,2,3,4 의외의 값을 입력할 경우 출력됨
		
		}
	}

}
