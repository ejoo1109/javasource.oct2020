
public class Main {
	enum week {sunday, monday, tuesday, wednesday, thursay, friday, saturday}
	
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println('c');
		System.out.println("문자열");
		System.out.println(false);
		System.out.println(10);
		System.out.println(200);
		System.out.println(0XA);
		System.out.println(012);
		System.out.println(0b1010);
		System.out.println(123_456_789);
		System.out.println(123.456);
		System.out.println(1.23456E-2);
		System.out.println('9');
		System.out.println('A');
		System.out.println('가');
		System.out.println("아버지가 \"방\"에 들어가신다.");
		System.out.println("c:\\basicjava\\ch02\\Main.java");
		System.out.println("이것은 문자열입니다.");
		System.out.println('A');
		System.out.println("A");
		System.out.println(false);
		System.out.println(true);
		System.out.println(123);
		System.out.println(123L);
		int age = 57;
		int Age = 0;
		age = (int)2147483648L;
		
		System.out.println(age);
		System.out.println(Age);
		
		
		week w1;
		w1 = week.monday;
		System.out.println(w1);
		
		int [] aveTemp = new int[12];
		aveTemp[0] = -4;		// 1월 평균 기온
		aveTemp[1] = -1;		// 2월 평균 기온 
		aveTemp[2] = 4;			// 3월 평균 기온 
		aveTemp[3] = 11;		// 4월 평균 기온 
		aveTemp[4] = 17;		// 5월 평균 기온 
		aveTemp[5] = 21;		// 6월 평균 기온 
		aveTemp[6] = 24;		// 7월 평균 기온 
		aveTemp[7] = 25;		// 8월 평균 기온 
		aveTemp[8] = 20;		// 9월 평균 기온 
		aveTemp[9] = 13;		// 10월 평균 기온 
		aveTemp[10] = 6;		// 11월 평균 기온 
		aveTemp[11] = -1;		// 12월 평균 기온

		System.out.println(aveTemp[2]);
		for(int temp : aveTemp){
			System.out.println(temp);
		}
		
	}

}
