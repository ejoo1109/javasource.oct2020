package employee;


public class Date {
	private int year;
	private int month;
	private int day;

	public Date() {
		year = 1990;
		month = 1;
		day = 1;
	}
	
	public Date(int yy, int mm, int dd) {
		setDate(yy, mm, dd);
	}

	public void finalize() {
		System.out.println("Finalize()");
	}
	
	public void setYear(int year) {
		this.year = max(1990, year);
	}
	
	public int getYear() {
		return year;
	}

	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = max(1, month);
		this.month = min(12, this.month);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		this.day = max(1, day);
		this.day = min(days[this.month], this.day);
	}

	public void setDate(int year, int month, int day) {
		/*
		int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		this.year = max(1990, year);
		this.month = max(1, month);
		this.month = min(12, this.month);
		this.day = max(1, day);
		this.day = min(days[this.month], this.day);
		*/
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void displayDate() {
		System.out.printf("%d-%d-%d\n", year, month, day);
	}
	
	private int max(int x, int y) {
		if(x > y)
			return x;
		return y;
	}
	private int min(int x, int y) {
		if(x < y)
			return x;
		return y;
	}

	@Override
	public String toString() {
		return String.format("%d-%d-%d", year, month, day);
	}
	
	
}
