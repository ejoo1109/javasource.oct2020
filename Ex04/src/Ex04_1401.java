
public class Ex04_1401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제
		int a = 10, b = 20;
		int x = 100, y = 200;
		boolean result = (++a > ++b) && (++x < ++y);
		//11>21 && 101<201
		System.out.printf("a=%d, b=%d, x=%d, y=%d \n result=%s \n",a,b,x,y,result);
		boolean result1 = (++a > ++b) || (++x < ++y);
		
		System.out.printf("a=%d, b=%d, x=%d, y=%d \n result1=%s \n",a,b,x,y,result1);
		}

}
