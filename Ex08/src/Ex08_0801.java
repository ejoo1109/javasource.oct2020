import java.util.Scanner;

public class Ex08_0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[5][4];//5�� 4�� ����
		for(int i = 0; i < exams.length; ++i) { //i�� 0���� �����ؼ� exam 5���� 1�� ������� ���ǽĺο�
			System.out.printf("%d ���� �л��� ������ �Է��ϼ��� : \n", i);
			for(int j = 0; j < exams[i].length; ++j) {//j�� 0���� �����ؼ� exam i =4���� 1�� ����
				System.out.printf("%d ��° ���� ���� : ", j);
				exams[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < exams.length; ++i) {//i�� 5���� ���������� �ݺ�
			System.out.printf("%d ���� �л� -----------------\n", i);
			int total = 0;//�ʱ�ȭ�� ����
			for(int j = 0; j < exams[i].length; ++j) {//j�� 0���� �����ؼ� 5���� �������� 1�� �����Ǵ� ���ǽ�
				System.out.printf("%d ��° ���� : %d\t", j, exams[i][j]);
				total += exams[i][j];//������ ����
			}
			System.out.printf("��� : %d\n", total/exams[i].length);//total���� 4�� ������
		}
	}
	}

