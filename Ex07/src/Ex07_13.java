
public class Ex07_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		for(i=1;i<=100;i++)
			total += i; //���ǽİ� �������� ����
		
		System.out.printf("1���� 100������ ���� %d �Դϴ�.\n", total);
		
		if(total > 5000)
			return; // ���� �޼ҵ带 ȣ���Ѱ����� ���ư���->���α׷� ����Ǵ� ȿ��
		
		System.out.printf("���α׷��� ���Դϴ�");//if�� ������ �ȵǱ� ������ �ѹ��� ������� �ʴ´�.
		
	}

}
