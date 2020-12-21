public class Main {

	public static void main(String[] args) {
		Date joindate = new Date(2012, 1, 1);
		RegularEmployee re = new RegularEmployee("전병선", "서울시", "123-4567", joindate, 2000000);
		re.displayEmployee();
		double salary = re.payCheck();
		System.out.printf("급여액 : %f\n", salary);
		Employee e = new RegularEmployee("김일", "부산시", "234-5678", joindate, 1000000);
		e.displayEmployee();
		//e.payCheck();
		SalesEmployee se = new SalesEmployee("김이", "수원시", "345-6789", joindate, 1000000, 0.2);
		se.setSales(10000000);
		salary = se.payCheck();
		System.out.printf("급여액 : %f\n", salary);
		SalesEmployee se2 = new SalesEmployee("김이", "수원시", "345-6789", joindate, 1000000, 0.2);
		se.setSales(10000000);
		salary = se.payCheck();
		System.out.printf("급여액 : %f\n", salary);
		if (se.equals(se2))
			System.out.println("같다!");
		else
			System.out.println("다르다!");
		Department dept = new Department();
		dept.addEmployee(re);
		dept.addEmployee(e);
		dept.addEmployee(se);
		dept.display();
	}

}
