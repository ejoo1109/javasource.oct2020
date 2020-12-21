import java.util.Scanner;

public class Ex08_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[]queue=new char[5];//5개의 문자 배열
		int rear=0;
		
		char carname='A'; //차 이름을 a부터 지정
		int select=9; // 선택지 임이의숫자지정
		
		while(select !=3) {//3이 아니면 while문을 반복한다
			System.out.printf("<1> 넣기 <2> 빼기 <3> 끝 : ");
			select = s.nextInt();
			
		 switch (select) {
			 case 1 :
				 if(rear >= 5) {
					 System.out.printf("터널이 꽉 차서 못 들어감\n");
		} else {
			queue[rear] = carname++;
			System.out.printf("%c 차가 터널에 들어감\n",queue[rear]);
			rear++;
		}
				 break;
			 case 2 :
				 if(rear ==0) {
					 System.out.println("빠져나갈 자동차 없음\n");
				 } else {
					 System.out.printf("%c 차가 터널에서 빠져나감\n",queue[0] );
					 for (int i=0;i<4;i++)
					 queue[i] =queue[i+1];
					 rear--;
				 }
				 break;
			 case 3 :
				 System.out.printf("현재 터널에 %d 대가 있음\n",rear);
				 System.out.println("프로그램을 종료합니다");
				 break;
				 
				 default:
					 System.out.println("잘못 입력했습니다. 다시 입력하세요\n");
	}
		}
}
}