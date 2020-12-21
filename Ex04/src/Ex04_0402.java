
public class Ex04_0402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제2.
		int i3 =10;
		int i4= 10;
		int r3 = 2 * i3++; //후치증가니까 r3=2*10 일단 r3=20 이다 이후 계산시 r3=20+1로 넘어감
		int r4 = 2 * ++i4; //전치증가니까 r4=2*11 r4=22
		int r5 = r3+1;
		System.out.printf("i3 = %d, i4 = %d, r3 = %d, r4 = %d\n", i3,i4,r3,r4);
		System.out.printf("r3 + 1 = %d \n", r5);
	}

}
