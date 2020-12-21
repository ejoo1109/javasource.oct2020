
public class Ex07_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		for(i=1;i<=100;i++)
			total += i; //조건식과 누적값을 설정
		
		System.out.printf("1부터 100까지의 합은 %d 입니다.\n", total);
		
		if(total > 5000)
			return; // 현재 메소드를 호출한곳으로 돌아간다->프로그램 종료되는 효과
		
		System.out.printf("프로그램의 끝입니다");//if문 조건이 안되기 때문에 한번도 실행되지 않는다.
		
	}

}
