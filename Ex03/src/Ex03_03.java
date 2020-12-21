
public class Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%d /%d = %d", 100, 200,0.5); //실행하면 오류남 0.5는 실수인데 %d 정수로 선언했기 떄문 %d /%d = %f", 100,200,0.5로 수정해야함
		//int age= 0;
		//double temperature = 0.0;
		
		//age = 100;
		//temperature = 123.45;
		
		//System.out.printf("%d, %f", age, temperature);
		
		int age= 1;
		double temperature = 123.45;
		
		age = 3;
		temperature = 4.5;
		
		System.out.printf("%d\n,%.1f", age, temperature);

	}

}
