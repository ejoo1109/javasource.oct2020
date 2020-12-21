
public class Ex11_03 {

	public static void main(String[] args) {
	 Car2 myCar2 = new Car2();
	 myCar2.setColor2("빨강");
	 myCar2.setSpeed2(0);

	 myCar2.upSpeed(30);
	 System.out.println("자동차1의 색상은 "+ myCar2.getColor() + "이며, 현재속도는 "
	 +myCar2.getSpeed() + "Km 입니다.");
	 
	}

}
