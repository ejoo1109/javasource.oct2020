
public class SalesEmployee extends RegularEmployee {
	private double commission;
	private double sales;
	public SalesEmployee(String name, String address, String telno, Date joinDate, double salary, double commission) {
		super(name, address, telno, joinDate, salary);
		this.commission = commission;
		this.sales = 0;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public double payCheck() {
		return super.salary + commission * sales;
	}

}
