
public class Ex07_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int i;
		
		for(i = 1; i<=100; i++) {
			total =total + i;
			
			if (total >= 1000)
				break;
		}
		System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? : %d\n", i);
		}

}

