import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int year;
		
		System.out.printf("������ �Է��ϼ��� :");
		year = s.nextInt();
		
		if((year % 4 ==0) && (year %100 != 0) || (year % 400 == 0))
		
		System.out.printf("%d ���� �����Դϴ�. \n", year);
		 else 
		
		System.out.printf("%d ���� ������ �ƴմϴ�. \n",year) ;
	
	
	}}

 // if (���ļ���) {��¹�} else {��¹�}



