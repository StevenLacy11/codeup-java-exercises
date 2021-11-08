

package util;

public class InputTest {
	public static void main(String[] args) {
		Input input = new Input();

		String myString = input.getString();
		System.out.println("myString = " + myString);

		System.out.println("Do you like pizza?");
		boolean likePizza = input.yesNo();
		System.out.println("likePizza = " + likePizza);

		System.out.println("Please enter a whole number.");
		int myInt = input.getInt();
		System.out.println("myInt = " + myInt);

		int myInt2 = input.getInt(1, 100);
		System.out.println("myInt2 = " + myInt2);

		System.out.println("Please enter a decimal number.");
		double myDouble = input.getDouble();
		System.out.println("myDouble = " + myDouble);

		boolean isContinue = input.yesNo("Would you like to continue?");
		System.out.println("isContinue = " + isContinue);

	}
}