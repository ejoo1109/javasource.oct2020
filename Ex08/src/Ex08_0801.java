import java.util.Scanner;

public class Ex08_0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[5][4];//5행 4열 개수
		for(int i = 0; i < exams.length; ++i) { //i는 0에서 시작해서 exam 5까지 1씩 증가라는 조건식부여
			System.out.printf("%d 번쨰 학생의 성적을 입력하세요 : \n", i);
			for(int j = 0; j < exams[i].length; ++j) {//j는 0에서 시작해서 exam i =4까지 1씩 증가
				System.out.printf("%d 번째 시험 성적 : ", j);
				exams[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < exams.length; ++i) {//i가 5보다 작을떄까지 반복
			System.out.printf("%d 번쨰 학생 -----------------\n", i);
			int total = 0;//초기화값 설정
			for(int j = 0; j < exams[i].length; ++j) {//j가 0에서 시작해서 5보다 작을까지 1씩 증가되는 조건식
				System.out.printf("%d 번째 시험 : %d\t", j, exams[i][j]);
				total += exams[i][j];//누적값 지정
			}
			System.out.printf("평균 : %d\n", total/exams[i].length);//total에서 4로 나눈값
		}
	}
	}

