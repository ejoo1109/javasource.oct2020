
public class Ex07_0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int i;
		for(i =1; i <= 100; ++i) {
			total += i;
			if(total >= 100)
				break;
		}
		System.out.printf("i = %d, total = %d\n", i,total);
	}

}
