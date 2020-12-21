import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int total = 0; //합계 누적할 변수선언하고 0으로 초기화
		int i,num1,num2,num3; // 3씩 증가할 변수를 i로 선언하고, num1,num2,num3에 입력받을 값을 선언
		
		System.out.printf(" 시작값 입력 : ");
		num1=s.nextInt(); //입력받을 값
		
		System.out.printf(" 끝값 입력 : ");
		num2=s.nextInt(); //입력받을 값
		
		System.out.printf(" 증가할 값 입력 : ");
		num3=s.nextInt(); //더하기 되는 숫자 입력
		
		for(i=num1; i <= num2; i=i+num3) { //1부터 사용자가 입력한값까지 3씩 증가시킨다
			total = total+i;
		}
		System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합계 : %d \n", num1,num2,num3, total);
	}

}
