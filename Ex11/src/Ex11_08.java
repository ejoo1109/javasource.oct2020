
public class Ex11_08 {
 public static void main(String[] args) {
	 Car8 myCar1 = new Car8();
	 myCar1.setColor8("Yellow");
	 myCar1.setSpeed8(100);
	 System.out.println(myCar1.setSpeed8(8));
	 Car8 myCar3 = new Car8("�Ķ�",30);
	 myCar3=myCar1;
		System.out.println("�ڵ���1�� ������" + myCar1.getColor8() + "�̸�, ����ӵ��� " 
		+ myCar1.getSpeed8() + " Km �Դϴ�.");
		System.out.println("�ڵ���3�� ������" + myCar3.getColor8() + "�̸�, ����ӵ��� " 
		+ myCar3.getSpeed8() + " Km �Դϴ�.");
	 if(myCar1 ==myCar3)
		 System.out.println("=");
	 else
		 System.out.println("!=");
 }
}
