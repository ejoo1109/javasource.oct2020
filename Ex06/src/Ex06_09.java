
public class Ex06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int i;
		
		for (i=501; i <= 1000; i=i+2) {
			total += i;
		}
		System.out.printf(" 500에서 1000까지의 홀수의 합 : %d \n", total);
	}

}
