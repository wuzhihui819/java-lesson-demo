public class InterfaceTester {
	public static void main(String[] args) {
		Rectangele rect = new Rectangele(5, 6);
		System.out.println("Area of rect = " + rect.area());
		Circle cir = new Circle(2.0);
		System.out.println("Area of cir = " + cir.area());
	}
}
