
public class Ex09_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Java Programing";
		String str2= "Java IT CookBook";
		
		System.out.println("원 문자열 1 ==> ["+str1+"]");
		System.out.println("원 문자열 2 ==> ["+str2+"]");
		
		System.out.println(str1.compareTo(str2));//str1과 str2를 비교하여 틀린부분
		System.out.println(str1.contains("Java"));//Java글자가 포함되어있는지확인
	}

}
