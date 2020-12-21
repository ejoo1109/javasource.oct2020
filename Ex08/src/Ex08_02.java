import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]aa=new int[4]; //배열을 선언
				Scanner s=new Scanner(System.in);
		int total;
		
		System.out.printf("1번쨰 숫자를 입력하세요 : ");//각 배열에 숫자를 입력한다
		aa[0] = s.nextInt();
		System.out.printf("2번쨰 숫자를 입력하세요 : ");
		aa[1] = s.nextInt();
		System.out.printf("3번쨰 숫자를 입력하세요 : ");
		aa[2] = s.nextInt();
		System.out.printf("4번쨰 숫자를 입력하세요 : ");
		aa[3] = s.nextInt();

		total = aa[0]+aa[1]+aa[2]+aa[3]; //각 배열에 저장된 숫자를 더한다.
		
		System.out.printf("합계 : %d \n",total);
		
	}

}
