
public class Ex09_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "  �ѱ� ABCD abcd  ";
		String result = "";
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) !=' ')
				result += str.substring(i,i+1);
	}
		System.out.println("�� ���ڿ� ==> ["+str+"]");
		System.out.println("�������� ==> [" +result+")");
	}

}
