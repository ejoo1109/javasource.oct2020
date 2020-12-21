
public class Ex04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		
		System.out.printf("%s \n", (a >= 100) && (a <=200)); //AND 연산: 둘다 참이거나 둘다 거짓
		//a는 100보다 크거나 같고 200보다 작거나 같다. 참&&거짓이므로 결과값은 false 
		System.out.printf("%s \n", (a >=100) || (a <=200)); //OR 연산: 둘중 하나만 참이어도 true
		//a는 100보다 크다 또는 200보다 작거나 같다. 거짓||참이므로 결과값은 true
		System.out.printf("%s \n", !(a == 100)); // NOT 연산:참이면 거짓이고 거짓이면 참으로 표현
		//a는 100과 같다. 거짓이지만 not을 붙여서 결과값은 true
	}

}
