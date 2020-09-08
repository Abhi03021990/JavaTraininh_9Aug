package classAndObjectEg;

public class Circle {
	//after using the final keword the value of the variable can not be changed
	final double PI = 3.142;
	//double radius;
	//constructor to create a circle object with specified radius
	/*
	 * public Circle(double radius) { this.radius = radius; }
	 */
	/**
	 * This method calculates the circumference of a circle 
	 * Circumference = 2*pi*radius , the value of pi = 3.142
	 * @return Circumference of a circle which is double value
	 */
	
	public double getCircumference(double radius) {
		if(radius<0) {
			System.out.println("Value of radius cannot be a negative value so returning -1");
			return -1;
			//System.exit(0);
		}
		return 2*PI*radius;	
	}
	public double getArea(double radius) {
		if(radius<0) {
			System.out.println("Value of radius cannot be a negative value so returning -1");
			return -1;
			//System.exit(0);
		}
		return 2*PI*radius*radius;
		
	}
	

}
