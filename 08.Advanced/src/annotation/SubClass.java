package annotation;

public class SubClass extends SuperClass {
	@Override
	public void overridemethod() {
		System.out.println("SubClass.overridemethod");
	}
	@Deprecated
	public void oldmethod() {
		System.out.println("SubClass.oldmethod");
	}
}
