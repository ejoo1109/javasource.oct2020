
public class Ex06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;//누적값을 표현하는 변수는 반드시 0으로 초기화 지정해줘야함
		int i; //i는 for문에서 초기값을 설정해줬기 떄문에 별도로 안해도 된다
		 for (i =1; i <=10; i++); {//i가 1을 시작으로; 10과 같을때까지 ;1씩증가
			 total= total + i;//total 변수 1부터 10까지 반복해서 누적됨
		 }
		 System.out.printf("1에서 10까지의 합 : %d \n", total);//for문에 의해 1부터 10까지 10회 반복
	}

}
