
public class Main {

	public static void main(String[] args) {
		SavingsAccount.setRate(0.002);
		/*
		SavingsAccount sa1 = new SavingsAccount("김일", 10000, 0.001);
		SavingsAccount sa2 = new SavingsAccount("김이", 20000, 0.001);
		SavingsAccount sa3 = new SavingsAccount("김삼", 30000, 0.001);
		*/
		SavingsAccount sa1 = new SavingsAccount("김일", 10000);
		SavingsAccount sa2 = new SavingsAccount("김이", 20000);
		SavingsAccount sa3 = new SavingsAccount("김삼", 30000);

		double a1 = sa1.getAmount();
		System.out.printf("김일 잔액 : %g\n", a1);
		double a2 = sa2.getAmount();
		System.out.printf("김이 잔액 : %g\n", a2);
		double a3 = sa3.getAmount();
		System.out.printf("김삼 잔액 : %g\n", a3);
		System.out.println("이자율 변경 ");
		// SavingsAccount.currentRate = 0.002;
		// sa1.setRate(0.002);
		// sa2.setRate(0.002);

		System.out.println("이자율 계산 ");
		sa1.earnInteret();
		sa2.earnInteret();
		sa3.earnInteret();
		a1 = sa1.getAmount();
		System.out.printf("김일 잔액 : %g\n", a1);
		a2 = sa2.getAmount();
		System.out.printf("김이 잔액 : %g\n", a2);
		a3 = sa3.getAmount();
		System.out.printf("김삼 잔액 : %g\n", a3);
	}

}
