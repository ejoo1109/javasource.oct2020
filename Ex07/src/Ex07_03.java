import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		
		while(true) {//조건식이 참일떄 무한루프
			System.out.printf("더하기할 첫 번쨰 수 : ");
			a = s.nextInt();
			System.out.printf("더하기할 두 번째 수 : ");
			b = s.nextInt();
			
			System.out.printf("%d + %d = %d \n",a,b,a+b);
		}
	}

}
