import java.util.Scanner;

public class Ex04_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int money,c500,c100,c50,c10;
		
		System.out.printf("## 교환할 돈은? \n");
		money = s.nextInt();
		
		c500= money / 500;
		money = money % 500;
		System.out.printf("\n 오백원짜리 ==> %d 개 \n",c500);
		
		c100 = money / 100;
		money = money % 100;
		System.out.printf("\n 백원짜리 ==> %d 개 \n",  c100);
		
		c50 = money / 50;
		money= money % 50;
		System.out.printf("\n 오십원짜리 ==> %d 개 \n", c50);
		
		c10 = money / 10;
		money= money % 10;
		System.out.printf("\n 십원짜리 ==> %d 개 \n", c10);
		
	}

}
