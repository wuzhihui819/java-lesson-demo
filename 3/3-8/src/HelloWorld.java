
public class HelloWorld {
	public static void main(String[] args) {
		int i = 0;
		String greetings[] = { "Hello world!", "No, I mena it!", "HELLO WORLD!!" };
		while (i < 4) {
			try {
				System.out.println(greetings[i]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			} catch (Exception e) {
				System.out.println(e.toString());
			} finally {
				System.out.println("This is always printed");
			}
			i++;
		}
	}
}
