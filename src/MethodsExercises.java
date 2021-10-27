import java.util.Scanner;

public class MethodsExercises {
	public static void main(String[] args) {
//        calculateCall();
//        getInteger();
		System.out.println(factorial(5));
	}


	public static void calculateCall() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to add, subtract, multiply, or divide?");
		String input = scanner.next();
		System.out.println("Input two numbers e.g. x x ");
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		calculate(num1, num2, input);

	}


	public static void calculate(float num1, float num2, String input) {
		switch (input) {
			case "add":
				System.out.println("Sum: " + add(num1, num2));
				break;
			case "subtract":
				System.out.println("Difference: " + subtract(num1, num2));
				break;
			case "multiply":
				System.out.println("Product: " + multiply(num1, num2));
				break;
			case "divide":
				System.out.println("Dividend: " + divide(num1, num2));
				break;
			default:
				System.out.println("idk how we got here, fam");
				break;
		}
	}

//        "Sum: " + add(num1, num2)


	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

// method overloading
//    public static float add(int num1, int num2, int num3) {
//    return num1 + num2 + num3;
//    }
//    public static int add(double num1, double numberBad, double iguess){
//        return (int) (num1 + numberBad + iguess);
//    }


	public static void getInteger() {
		Scanner scanner = new Scanner(System.in);
		int userNum = scanner.nextInt();
		int min = 1;
		int max = 10;
		boolean goodNum;
		goodNum = (min > userNum) && (userNum > max);
		if(goodNum)
			System.out.println("Thanks");
	}



	public static long factorial(int userNum){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 10");
		userNum = scanner.nextInt();
		long result = 1;
		for(int i = 1; i <= userNum; i++) {
			result *= i;
		}
		System.out.println("Here is the factorial of your number ");
		return result;
	}
}
