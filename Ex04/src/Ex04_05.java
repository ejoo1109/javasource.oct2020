
public class Ex04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 100;
			int b = 200;
			
			boolean result = a == b;
			System.out.printf("%d == %d는 %s 이다.\n", a,b,result);
			
			boolean result1 = a != b;
			System.out.printf("%d != %d는 %s 이다.\n", a,b,result1);
			
			boolean result2 = a > b;
			System.out.printf("%d > %d는 %s 이다.\n", a,b,result2);	
		
			boolean result3 = a < b;
			System.out.printf("%d < %d는 %s 이다.\n", a,b,result3);	
			
			boolean result4 = a >= b;
			System.out.printf("%d >= %d는 %s 이다.\n", a,b,result4);	
			
			boolean result5 = a <= b;
			System.out.printf("%d <= %d는 %s 이다.\n", a,b,result5);	
			
			//a = b; //=한개만 넣으면 대입연산자가 되므로 == 두번 넣는다
			System.out.printf("%d = %d는 %s 이다.\n", a,b,a = b);	
	}

}
