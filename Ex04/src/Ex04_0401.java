
public class Ex04_0401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//연습문제1.
	int i1 =10;
	int i2= 10;
	int r1 = 2 * ++i1; //전치증가연산자일때 i1을 1증가시키고 r1에 대입 (2*11=22)
	int r2 = 2 * i2++; //후치증가연산자일떄 일단 r2=20 이후계산시 20+1로 계산됨
	System.out.printf("i1 = %d, i2 = %d, r1 = %d, r2 = %d\n", i1,i2,r1,r2);
}
}