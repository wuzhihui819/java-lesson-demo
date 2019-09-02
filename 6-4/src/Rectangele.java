public class Rectangele implements Shape2D{

	int width, height;
	public Rectangele(int w, int h) {
		width = w;
		height = h;
	}
	@Override
	public double area() {
		return (width * height);
	}
	
}
