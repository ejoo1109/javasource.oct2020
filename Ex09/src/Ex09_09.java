
public class Ex09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Programing";
		String str2 = "Java Programing";
		String str3 = new String("Java Programing");//new 연산자를 이용하여 문자열 초기화
		
		System.out.println("원 문자열1 ==> ["+str1+"]");
		System.out.println("원 문자열2 ==> ["+str2+"]");
		System.out.println("원 문자열3 ==> ["+str3+"]\n");
		
		System.out.println("문자열1 == 문자열2 결과: \t"+ (str1 == str2));
		System.out.println("문자열1.equals(문자열2) 결과: \t"+ str1.equals (str2));
		System.out.println("문자열1 == 문자열3 결과: \t"+ (str1 == str3));
		System.out.println("문자열1.equals(문자열3) 결과: \t"+ str1.equals (str3));
	}//str1과 str2는 값이 같은 equals는 true, ==도 저장 위치가 같아서 true가 나온다. 
	//str1과 str3은 값은 같아서 equals 는 true 지만 ==는 저장 위치가 다르므로 false로 나타난다.

}
