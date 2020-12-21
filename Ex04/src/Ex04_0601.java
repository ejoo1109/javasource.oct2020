
public class Ex04_0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 4;
		int max = x > y? ++x :++y;
		System.out.printf("x = %d, y = %d, max = %d\n",x, y, max);
		//비교 삼항 연산자
		//표현식1 ? 표현식2 :표현식3;
		//표현식1의 참/거짓 평가
		//참인 경우 표현식2 연산 수행
		//거짓인 경우 표현식3 연산 수행
		//int x = 3;
		//int y = 4;
		//int max = x>y ? x:y;
		//연산에 참여하지 않는 코드는 실행되지 않는다
		//표현식1에서 나온 결론이 거짓이어서 ++x는 연산에 참여하지 않는다.
	
				
	}

}
