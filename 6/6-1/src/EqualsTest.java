public class EqualsTest {
	public static void main(String[] args) {
		BankAccount a = new BankAccount("Bob", 123456, 100.00f);
		BankAccount b = new BankAccount("Bob", 123456, 100.00f);
		//BankAccount b = a;
		if(a.equals(b)) {
			System.out.println("equals_YES");
		} else {
			System.out.println("equals_NO");
		}
		if(a == b) {
			System.out.println("==_YES");
		} else {
			System.out.println("==_NO");
		}
	}
}
