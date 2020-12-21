
public class Ex11_12 {
	public static void main(String[] args) {
		Pet1 pet1 = new Pet1();
		pet1.type="강아지";
		pet1.age=9;
		System.out.println(pet1.type+"는"+pet1.age+"개월입니다.");
		
		Pet1 pet2 = new Pet1();
		pet2.type="고양이";
		pet2.age=12;
		System.out.println(pet2.type+"는"+pet2.age+"개월입니다.");
	}
}