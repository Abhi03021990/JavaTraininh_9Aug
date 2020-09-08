package interfaceEg;

public class Triangle implements Shape{
	private double base , height ,area;
	@Override
	public double area(double parameter1, double parameter2) {
		base = parameter1;
		height = parameter2;
		area = 0.5*base*height;
		return area;
	}
	public void displayTriangleArea() {
		System.out.println("Area of Triangle with base= "+base+" and height = "+height +" is "+area);
	}

}
