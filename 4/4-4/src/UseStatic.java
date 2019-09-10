public class UseStatic {
	public static void main(String[] args) {
		System.out.println("Count.couter is " + Count.counter);
		Count Tom = new Count();
		Count John = new Count();
		System.out.println("Tom's serialNumber is " + Tom.getSerialNumber());
		System.out.println("John's serialNumber is " + John.getSerialNumber());
		System.out.println("Now Count.counter is " + Count.counter);
	}
}
