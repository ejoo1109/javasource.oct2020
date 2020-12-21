import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int total = 0; //합계 누적할 변수선언하고 0으로 초기화
		int i,num; // 1씩 증가할 변수를 i로 선언하고, num에 입력받을 값을 선언
		
		System.out.printf(" 값 입력 : ");
		num=s.nextInt(); //입력받을 값
		
		for(i=1; i <= num; ++i) { //1부터 사용자가 입력한값까지 1씩 증가시킨다
			total = total+i;
		}
		System.out.printf(" 1에서 %d까지의 합계 : %d \n", num, total);
	}

}
