
public class VariableArgs {

	public static void main(String[] args) {
		foo(10, 20, 30, 40, 50);
		foo(100, 200);
		foo();	
	}
	
	public static void foo(int ... v) {
		System.out.println("인수의 개수 : " + v.length + " 개");
		for(int x : v) 
			System.out.print(x + ", ");
		System.out.println();
	}

}
