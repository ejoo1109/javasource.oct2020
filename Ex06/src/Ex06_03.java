
public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for (i = 0; i <3; i++) {
			System.out.printf("안녕하세요?\n");
			System.out.printf("##또 안녕하세요?##\n");			
	} //for문에 중괄호를 넣었음
		
		System.out.printf("--\n--\n");
		
		for (i = 0; i <3; i++)
			System.out.printf("안녕하세요?\n");
			System.out.printf("##또 안녕하세요?##\n");	//중괄호를 넣지 않아서 for 바로 다음것만 3번 실행됨	
	}
}
