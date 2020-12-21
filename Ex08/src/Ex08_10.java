import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int row, col;
		
		System.out.printf("행 개수를 입력");
		row=s.nextInt();
		System.out.printf("열 개수를 입력");
		col=s.nextInt();
		
		int[][] aa=new int[row][col];//배열을 선언할때 변수로 첨자를 사용할수 있다.(동적 크기할당)
		int i,k;
		int val =1;
		
		for(i=0; i<row;i++) { //배열의 크기만큼 값을 입력한다
			for(k=0;k<col;k++) {
				aa[i][k]=val;
				val++;
			}
		}
		System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력 \n",row,col);
		
		for(i=0;i<row;i++) {
			for(k=0;k<col;k++) {
				System.out.printf("%3d",aa[i][k]);
			}
			System.out.printf("\n");//2차원 배열에 저장된 값을 출력
		}
	}

}
