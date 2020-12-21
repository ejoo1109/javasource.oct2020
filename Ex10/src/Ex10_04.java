
public class Ex10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=0;
		int result;
		try {
			if (b==0)
				throw new Exception("0으로 나누면 안됩니다.");//오류메세지 생성
			result=a/b;
		}
		catch (Exception e) {
			System.out.print("발생 오류 ==> ");
			System.out.println(e.getMessage());//오류메시지 만든걸 호출하여 출력
		}
	}

}
