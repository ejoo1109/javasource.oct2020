import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]stack=new char[5];//5개의 문자 배열
		int top=0;
		
		char carname='A'; //차 이름을 a부터 지정
		int select=9; // 선택지 임이의숫자지정
		
		while(select !=3) {//3이 아니면 while문을 반복한다
			System.out.printf("<1> 넣기 <2> 빼기 <3> 끝 : ");
			select = s.nextInt();
			
		 switch (select) {
			 case 1 :
				 if(top >= 5) {
					 System.out.printf("터널이 꽉 차서 못 들어감\n");
		} else {
			stack[top] = carname;
			System.out.printf("%c 차가 터널에 들어감\n",stack[top]);
			top++;
		}
				 break;
			 case 2 :
				 if(top ==0) {
					 System.out.println("빠져나갈 자동차 없음\n");
				 } else {
					 top--;
					 System.out.printf("%c 차가 터널에서 빠져나감\n",stack[top]);
					 stack[top]=' ' ;
				 }
				 break;
			 case 3 :
				 System.out.printf("현재 터널에 %d 대가 있음\n",top);
				 System.out.println("프로그램을 종료합니다");
				 break;
				 default:
					 System.out.println("잘못 입력했습니다. 다시 입력하세요");
				 }
		 }
			
		}
	}


