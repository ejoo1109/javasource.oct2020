
public class Main {

	public static void main(String[] args) {
		Triangle tri = new Triangle(10, 20, 11, 21, 12, 22);
		Rectangle rect = new Rectangle(20, 30, 100, 200);
		Circle cir = new Circle(30, 40, 300);
		// Geometry geo = new Geometry(10, 20);
		Geometry [] geos = new Geometry[3];
		geos[0] = tri;
		geos[1] = rect;
		geos[2] = cir;
		draw(geos);
	}
	
	public static void draw(Geometry [] geos) {
		for(Geometry geo : geos)
			geo.draw();
	}

}
