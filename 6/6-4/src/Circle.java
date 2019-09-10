public class Circle implements Shape2D{
	double radius;
	public Circle(double r) {
		radius = r;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (pi * radius * radius);
	}
	
}
