
public class Triangle extends Geometry {
	private int x1, y1;
	private int x2, y2;
	public Triangle(int x, int y, int x1, int y1, int x2, int y2) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void draw() {
		System.out.printf("Triangle : x = %d, y = %d, x1 = %d, y1 = %d, x2 = %d, y2 = %d\n",
				x, y, x1, y1, x2, y2);
	}
}
