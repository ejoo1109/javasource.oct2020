
public class Ex11_01 {

	public static void main(String[] args) {
	 Car myCar1 = new Car();
	 myCar1.color = "빨강";
	 myCar1.speed = 0;
	 
	 Car myCar2 = new Car();
	 myCar2.color = "파랑";
	 myCar2.speed = 0;
	 
	 Car myCar3 = new Car();
	 myCar3.color = "노랑";
	 myCar3.speed = 0;
	 
	 myCar1.upSpeed(30);
	 System.out.println("자동차의1의 색상은" + myCar1.color +"이며, 현재속도는 "
	 + myCar1.speed + " km입니다.");

	 myCar2.upSpeed(60);
	 System.out.println("자동차의2의 색상은" + myCar2.color +"이며, 현재속도는 "
	 + myCar2.speed + " km입니다.");

	 myCar3.upSpeed(0);
	 System.out.println("자동차의1의 색상은" + myCar3.color +"이며, 현재속도는 "
	 + myCar3.speed + " km입니다.");

	}

}
