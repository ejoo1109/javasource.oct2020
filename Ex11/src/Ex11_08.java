
public class Ex11_08 {
 public static void main(String[] args) {
	 Car8 myCar1 = new Car8();
	 myCar1.setColor8("Yellow");
	 myCar1.setSpeed8(100);
	 System.out.println(myCar1.setSpeed8(8));
	 Car8 myCar3 = new Car8("파랑",30);
	 myCar3=myCar1;
		System.out.println("자동차1의 색상은" + myCar1.getColor8() + "이며, 현재속도는 " 
		+ myCar1.getSpeed8() + " Km 입니다.");
		System.out.println("자동차3의 색상은" + myCar3.getColor8() + "이며, 현재속도는 " 
		+ myCar3.getSpeed8() + " Km 입니다.");
	 if(myCar1 ==myCar3)
		 System.out.println("=");
	 else
		 System.out.println("!=");
 }
}
