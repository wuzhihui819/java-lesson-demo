public class ThreadTest {
	static Lefthand left;
	static Righthand right;
	public static void main(String[] args) {
		left = new Lefthand();
		right = new Righthand();
		left.start();
		right.start();
	}
}
