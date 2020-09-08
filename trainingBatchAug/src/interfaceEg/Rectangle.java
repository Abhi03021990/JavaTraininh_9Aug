package interfaceEg;

public class Rectangle implements Shape{
	private double length , breadth ,area;

	@Override
	public double area(double length, double breadth) {
		this.length= length;
		this.breadth = breadth;
		area= length*breadth;
		return area;
	}
	
	public void displayRectangleArea() {
		System.out.println("Area of Rectangle with length= "+length+" and breadth = "+breadth +" is "+area);
	}

}
