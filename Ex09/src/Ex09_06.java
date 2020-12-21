
public class Ex09_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "  한글 ABCD abcd  ";
		
		System.out.println("원 문자열==> ["+str+"]");
		System.out.println("대문자로 변경==> ["+str.toUpperCase()+"]");
		System.out.println("소문자로 변경==> ["+str.toLowerCase()+"]");
		System.out.println("공백문자 잘라내기==> ["+str.trim()+"]");//앞.뒤 공백만 제거
	}

}
