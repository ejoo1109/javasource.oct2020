
public class Circle extends Geometry {
	private int radius;
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void draw() {
		System.out.printf("Circle : x = %d, y  = %d, radius = %d\n", x, y, radius);
	}
}
