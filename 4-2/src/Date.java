
public class Date {
	private int day, month, year;

	Date() {
		day = 1;
		month = 1;
		year = 1998;
	}

	Date(int i, int j, int k) {
		day = i;
		month = j;
		year = k;
	}

	Date(Date d) {
		day = d.day;
		month = d.month;
		year = d.year;
	}

	public String printDate() {
		return day + "/" + month + "/" + year;
	}

	public Date tomorrow() {
		Date d = new Date(this);
		d.day++;
		if (d.day > d.daysInmonth()) {
			d.day = 1;
			d.month++;
			if (d.month > 12) {
				d.month = 1;
				d.year++;
			}
		}
		return d;
	}

	public int daysInmonth() {
		if (month < 0 || month > 12)
			return -1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				return 29;
			else
				return 28;
		}
	}

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(28, 2, 1964);
		Date d3 = new Date(d2);
		System.out.println("date d1 is (dd/mm/yy):" + d1.printDate());
		System.out.println("date d3 is (dd/mm/yy):" + d3.printDate());
		System.out.println("Its tomorrow is (dd/mm/yy)" + d3.tomorrow().printDate());
	}
}
