
public class Ex04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 100;
			int b = 200;
			
			boolean result = a == b;
			System.out.printf("%d == %d�� %s �̴�.\n", a,b,result);
			
			boolean result1 = a != b;
			System.out.printf("%d != %d�� %s �̴�.\n", a,b,result1);
			
			boolean result2 = a > b;
			System.out.printf("%d > %d�� %s �̴�.\n", a,b,result2);	
		
			boolean result3 = a < b;
			System.out.printf("%d < %d�� %s �̴�.\n", a,b,result3);	
			
			boolean result4 = a >= b;
			System.out.printf("%d >= %d�� %s �̴�.\n", a,b,result4);	
			
			boolean result5 = a <= b;
			System.out.printf("%d <= %d�� %s �̴�.\n", a,b,result5);	
			
			//a = b; //=�Ѱ��� ������ ���Կ����ڰ� �ǹǷ� == �ι� �ִ´�
			System.out.printf("%d = %d�� %s �̴�.\n", a,b,a = b);	
	}

}
