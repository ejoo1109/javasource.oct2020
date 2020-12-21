import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean login = false;
		boolean scriptExecution = false;
		int age = 18;
		if(age > 18) {
			login = true;
			scriptExecution = true;
		}
		else {
			login = false;
			scriptExecution = false;
		}
		System.out.println(login + ", " + scriptExecution);
		int score = 81;
		String result;
		if(score > 90)
			result = "아주 훌륭합니다.";
		else if(score > 80)
			result = "참 잘했어요";
		else if(score > 70)
			result = "좋습니다.";
		else
			result = "분발하세요.";
		System.out.println(result);
		int rate = 1;
		String s = "2등급";
		switch(s) {
		case "1등급":
			rate = 1;
			break;
		case "2등급":
			rate = 2;
			break;
		case "3등급":
			rate = 3;
		default:
			rate = 4;
		}
		switch(rate) {
		case 1:
			result = "아주 훌륭합니다.";
			break;
		case 2:
			result = "참 잘했어요";
			break;
		case 3:
			result = "좋습니다.";
			break;
		default:
			result = "분발하세요.";
			break;
		}
		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		int value;
		/*	
		System.out.println("10 보다 큰 숫자를 입력하세요.");
		value = scanner.nextInt();
		while(value <= 10) {
			if(value % 2 == 0)
				break;
			System.out.println("잘못 입력하셨습니다. 10 보다 큰 숫자를 입력하세요.");
			value = scanner.nextInt();
		}
		System.out.printf("감사합니다. %d 를 입력하셨습니다.", value);
		*/
		do {
			System.out.println("10 보다 큰 숫자를 입력하세요.");
			value = scanner.nextInt();
		} while(value <= 10);
		System.out.printf("감사합니다. %d 를 입력하셨습니다.\n", value);
		for(int i = 0; i < 5; ++i) {
			if(i % 2 == 0)
				continue;
			System.out.printf("%d 번째 : 당신을 사랑합니다.\n", i);
		}
		int aveTemp [] = {-4, -1, 4, 11, 17, 21, 24, 25, 20, 13, 6, -1};
		for(int element : aveTemp)
			System.out.println("값: " + element);
		for(int i = 0; i < aveTemp.length; ++i)
			System.out.println("값: " + aveTemp[i]);
	}

}
