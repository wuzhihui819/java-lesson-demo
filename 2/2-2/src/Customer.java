public class Customer {
	private String name;
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		{
			String name = "Tom David";
			customer.name = name;
			System.out.println("The customer's name:" + customer.name);
		}
		String name = "John Smith";
		customer.name = name;
		System.out.println("The customer's name:" + customer.name);
	}
}
