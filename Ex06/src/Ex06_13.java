
public class Ex06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		
		for (i = 0;i <3;i++)//바깥 for문을 세번 반복
		{
			for (k = 0;k<2; k++)//안쪽 for문을 두번 반복
			{
				System.out.printf("중첩 for문입니다. (i값:%d, k값: %d)\n", i, k);
		//i와 k값을 총 여섯번 (3x2=6) 출력한다.
			}
		
		}
	}

}
