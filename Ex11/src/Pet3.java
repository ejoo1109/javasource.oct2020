
public class Pet3 {
	private String type;
	private int age;
	static int count =0;
	
	Pet3(String type,int age){
	this.type=type;
	this.age=age;
}
	static int getCount() {
		return count;
	}
	public String move(String a) {
		a=type;
		System.out.println(type +"가 움직입니다.");
		return a;
	}
	public int getAge() {
		return this.age;
}
	public String type () {
		return this.type;
	}
}