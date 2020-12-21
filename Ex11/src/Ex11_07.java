
public class Ex11_07 {

	public static void main(String[] args) {
		Car7 myCar1 = new Car7 ("빨강",0);
		Car7 myCar2 = new Car7 ("파랑",30);
		
		System.out.println("자동차1의 색상은" + myCar1.getColor7() + "이며, 현재속도는 " 
		+ myCar1.getSpeed7() + " Km 입니다.");
		System.out.println("자동차2의 색상은" + myCar2.getColor7() + "이며, 현재속도는 " 
		+ myCar2.getSpeed7() + " Km 입니다.");

	}

}
