public class Ex05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 75;
		
		if (a > 50) {
			if (a < 100)
			System.out.printf("50보다 크고 100보다 작군요\n");// 5행이 참이고  6행이 참이면 실행됨
		else 
			System.out.printf("100보다 크군요");//5행이 참이고 6행이 거짓이면 실행됨
		}
		else {
			System.out.printf("50보다 작군요");//5행이 거짓이면 실행됨
		}
	}

}
