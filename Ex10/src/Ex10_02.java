
public class Ex10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]aa=new int[3];
		try {
			aa[2]=100/0;
			aa[3]=100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��~"); //arry������ �߻������� ��µ�
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ���� ��������~"); //arithmeic ������ �߻��ϸ� ��µ�
		} finally { //������ ���� �ȳ��� ��µ�
			System.out.println("�� �κ��� ������ ���Ϳ�~");
		}
	}

}
