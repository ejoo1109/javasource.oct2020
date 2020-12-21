package employee;

public class Department {
	private int headCount;
	private Employee [] employees;
	
	public Department() {
		headCount = 0;
		employees = new Employee[10];
	}
	
	public void addEmployee(Employee e) {
		if(headCount < 10)
			employees[headCount++] = e;
	}
	
	public void display() {
		for(int i = 0; i < headCount; ++i) {
			employees[i].displayEmployee();
			double salary = employees[i].payCheck();
			System.out.printf("급여액 : %f\n", salary);
		}
	}
}
