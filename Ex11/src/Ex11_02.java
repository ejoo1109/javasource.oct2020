
public class Ex11_02 {

	public static void main(String[] args) {
	 Car1 myCar1 = new Car1();
	 myCar1.color1 = "����";
	 myCar1.speed1 = 0;

	 myCar1.upSpeed(30);
	 System.out.println("�ڵ�����1�� ������" + myCar1.color1 +"�̸�, ����ӵ��� "
	 + myCar1.speed1 + " km�Դϴ�.");
	 System.out.println("�ڵ���1�� ������ "+ myCar1.getColor() + "�̸�, ����ӵ��� "
	 +myCar1.getSpeed() + "Km �Դϴ�.");
	 
	}

}
