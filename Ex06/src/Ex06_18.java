import java.util.Scanner;

public class Ex06_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		
		for(;;) {//무한반복
			System.out.printf("더할 첫 번쨰 수 : ");
			a=s.nextInt();
			System.out.printf("더할 두번째 수 : ");
			b=s.nextInt();
			System.out.printf("%d + %d =%d \n",a,b,a+b);//덧셈결과 출력
		}
	}

}
