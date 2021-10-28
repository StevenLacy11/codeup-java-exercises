package util;

public class InputTest {
	public static void main(String[] args) {
		Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(20,45));
		System.out.println(input.getInt());
        System.out.println(input.getDouble(1.99, 99.99));
        System.out.println(input.getDouble());

	}

}
