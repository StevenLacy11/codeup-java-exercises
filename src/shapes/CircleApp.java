package shapes;

import util.Input;

public class CircleApp {
	public static void main(String[] args) {
		String prompt = "Enter the radius of your circle:";
		Input input = new Input();
		double radius = input.getDouble();
		Circle circle = new Circle(radius);
		double area = circle.getArea();
		double circumference = circle.getCircumference();
		System.out.printf("The area of your circle is %.2f\n The circumference is %.2f%n", area, circumference);

	}
}
