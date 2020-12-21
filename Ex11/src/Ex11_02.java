
public class Ex11_02 {

	public static void main(String[] args) {
	 Car1 myCar1 = new Car1();
	 myCar1.color1 = "빨강";
	 myCar1.speed1 = 0;

	 myCar1.upSpeed(30);
	 System.out.println("자동차의1의 색상은" + myCar1.color1 +"이며, 현재속도는 "
	 + myCar1.speed1 + " km입니다.");
	 System.out.println("자동차1의 색상은 "+ myCar1.getColor() + "이며, 현재속도는 "
	 +myCar1.getSpeed() + "Km 입니다.");
	 
	}

}
