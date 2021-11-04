package shapes;

public class ShapesTest {

	public static void main(String[] args) {

		Measurable myShape;

		myShape = new Rectangle(5, 4);
		System.out.println(myShape.getArea() + " This is Rectangle area");
		System.out.println(myShape.getPerimeter() + " This is Rectangle perimeter");

		myShape = new Square(5);
		System.out.println(myShape.getArea() + " This is square area");
		System.out.println(myShape.getPerimeter() + " This is square perimeter");
	}
}