
public class Circle {
	static double PI = 3.14159265;
	private int radius;

	public double circumference() {
		return 2 * PI * radius;
	}

	public void setradius(int r) {
		radius = r;
	}
}
