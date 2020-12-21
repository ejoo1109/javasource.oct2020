
public class Ex11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet3 pet1=new Pet3("강아지",8);
		pet1.count++;
		
		System.out.println(pet1.type()+pet1.getAge());
		Pet3 pet2=new Pet3("고양이",10);
		pet2.count++;
		System.out.println(pet2.type()+pet2.getAge());
		System.out.println(Pet3.getCount());
	}

}
