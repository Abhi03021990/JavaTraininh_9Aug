package interfaceEg;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		t.area(4, 2);
		t.displayTriangleArea();
		Rectangle r = new Rectangle();
		r.area(4, 8);
		r.displayRectangleArea();
		
		//using interface 
		Shape shape = new Triangle();
		System.out.println(shape.area(2, 4));
		shape = new Rectangle();
		System.out.println("interface e.g");
		System.out.println(shape.area(2, 4));
		
		
		
		
	}

}
