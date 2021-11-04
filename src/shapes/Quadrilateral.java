package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

	protected double length;

	protected double width;

	//Constructor
	public Quadrilateral(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//getter methods
	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	// setter method
	public abstract void setLength(double length);
	public abstract void setWidth(double width);


}