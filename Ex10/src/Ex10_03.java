
public class Ex10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100, b=0;
		int result;
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.printf("발생 오류 ==> ");
			System.out.printf(e.getMessage());//오류나는 메시지를 끌어와서 출력해준다
		}
	}

}
