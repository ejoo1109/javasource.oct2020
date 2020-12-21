
public class Ex09_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		
		func1(a);
		System.out.println("main의 값 : " + a);
		
	}
	static void func1(int a) {
		a=a+1;
		System.out.println("func1의값 :" + a);
	}
}
