import java.util.Scanner;

public class Ex09_21 {
//문자열이 대문자는 소문자로 소문자는 대문자로 문자는 그대로 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in,out="";
		char ch;
		int count, i;
		int diff = 'a' - 'A';
		
		System.out.printf("문자열을 입력하세요 : ");
		in = s.nextLine();
		
		count=in.length();
		
		for(i=0;i<count;i++) {
			ch=in.charAt(i);
			if (('A' <= ch) && (ch <= 'Z'))
				out += (char) (ch+diff);
			else if (('a' <= ch) && (ch <= 'z'))
				out += (char) (ch-diff);
			else
				out += (char) ch;
		}
		
		System.out.printf("변환된 문자열 ==> %s \n",out);
	}

}
