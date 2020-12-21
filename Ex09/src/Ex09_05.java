import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str, strRep, strSub;
		
		System.out.print("문자열을 입력하세요 ==> ");
		str=s.nextLine();
		
		strRep = str.replace(" ","$");
		strSub = str.substring (3,8);
		String Ary1 []= str.split(" ");//배열과 변수선언.. []안에 공백 기준으로 나눠진 단어가 배열에 들어감
		
		System.out.println("입력 문자열 ==> "+str);
		System.out.println("바꾼 문자열 ==> "+strRep);
		System.out.println("추출 문자열 ==> "+strSub);
		for(int i =0;i<Ary1.length; i++) //조건식 
			System.out.println("분리한 문자열 ==> "+Ary1[i]);//Ary1의 i배열
	}

}
