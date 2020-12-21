
public class Callby {

	public static void main(String[] args) {
		foo();
		foo2();
	}
	
	public static void foo() {
		int i = 0;
		method(i);
		System.out.println(i);
	
	}
	
	public static void method(int value) {
		value = 100;
	}
	
	public static void foo2() {
		MyClass o = new MyClass();
		method2(o);
		int value = o.getValue();
		System.out.println(value);
	}
	
	public static void method2(MyClass r) {
		r.setValue(100);
	}

}
