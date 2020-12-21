
public class SavingsAccount {
	private String name;
	private double amount;
	private static double currentRate;
	static {
		currentRate = 0.001;
	}
	
	public SavingsAccount(String name, double amount) { // , double currentRate) {
		this.name = name;
		this.amount = amount;
		// this.currentRate = currentRate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public static void setRate(double rate) {
		currentRate = rate;
	}
	
	public void earnInteret() {
		amount += currentRate * amount;
	}
}
