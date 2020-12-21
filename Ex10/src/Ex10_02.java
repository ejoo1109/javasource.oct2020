
public class Ex10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]aa=new int[3];
		try {
			aa[2]=100/0;
			aa[3]=100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열 크기보다 커요~"); //arry오류가 발생했을때 출력됨
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류에오~"); //arithmeic 오류가 발생하면 출력됨
		} finally { //오류가 나건 안나건 출력됨
			System.out.println("이 부분은 무조건 나와요~");
		}
	}

}
