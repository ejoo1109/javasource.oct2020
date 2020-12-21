import java.util.Scanner;

public class Ex02_0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==>");
		int first = s.nextInt();
		System.out.print("(1)µ¡¼À (2) »¬¼À (3) °ö¼À (4) ³ª´°¼À ==>");
		int operator =  s.nextInt();
		System.out.print("µÎ¹ø¤Š °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==>");
		int second = s.nextInt();
		int result;
		String op;
		if(operator == 1) { //µ¡¼À
			result = first + second;
		op= "+";
	}
		else if(operator ==2) {//»¬¼À
			result = first - second;
			op = "-";
		}
		else if(operator ==3) { //°ö¼À
			result = first * second;
			op = "*";
		}
		else { //³ª´°¼À
			result = first / second;
		op = "/";
	}
		System.out.println(first + op + second+"="+result);
	}

}
