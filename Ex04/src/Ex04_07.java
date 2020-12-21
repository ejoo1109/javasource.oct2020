
public class Ex04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = -200;
		
		boolean a = (num1 != 0); //num1는 0과 같지않다에 대한 참/거짓 구분값이 저장됨
		boolean b = (num2 != 0); //num2는 0과 같지않다에 대한 참/거짓 구분값이 저장됨
		
		System.out.printf("%s \n", a && b); //a = 참과 b = 참 이므로 true
		System.out.printf("%s \n", a || b); // a=참 또는 b=참 이므로 true
		System.out.printf("%s \n", !a); // a=참이 아니다를 거짓으로 표현하므로 false가 출력됨
		
		
	}

}
