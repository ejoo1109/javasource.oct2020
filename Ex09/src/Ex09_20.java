import java.util.Scanner;

public class Ex09_20 {
//문자를 거꾸로 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str;
		String str1="";
		int count,i;
		
		System.out.printf("문자열을 입력하세요 : ");
		str=s.nextLine();
		
		count=str.length();
		
		for (i=0; i<count; i++) {
			str1 += str.charAt(count -(i+1));
		}
		
		System.out.printf("내용을 거꾸로 출력==> %s \n",str1);
		
	}

}
