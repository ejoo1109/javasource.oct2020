
public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA 공부하는중~JAVA 는 재밌어요~";
		
		System.out.println("문자열 ==> "+str);
		
		System.out.print("제일 처음 나오는 JAVA 위치 ==> ");
		System.out.println(str.indexOf("JAVA"));
		
		System.out.print("마지막에 나오는 JAVA 위치 ==> ");
		System.out.println(str.lastIndexOf("JAVA"));
	}

}