import java.util.Scanner;

public class ControlFlowExercises {
	public static void main(String[] args) {


		int z = 5;

		while (z <= 15){
			System.out.println(z);
			z++;
		}


		for(int i = 100; i >= -10; i -= 5)
			System.out.println(i);


		for(long i = 2; i <= 1000000; i*=i)
			System.out.println(i);

		for (int i=1; i<=100; i++) {
			if (i%15==0) {
				System.out.println("FizzBuzz");
			} else if (i%5==0) {
				System.out.println("Buzz");
			} else if (i%3==0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}

//		 instantiate an object from the
//		 Scanner class to enable reading
//		 in from the keyboard


        String choice = "y", message;
		int a;
		long startValue, squared, cubed;

		Scanner keyboard1 = new Scanner(System.in);

        while (choice.equals("y")) {

            // gets the input from the user
            System.out.println("What number would you like to go up to?");
			startValue = keyboard1.nextLong();

            System.out.print("Number | Squared |  Cubed");
            System.out.print("\n------ | ------  | ------");

            for (a = 1; a <= startValue; a++) {
                squared = (long) Math.pow(a, 2);
                cubed = (long) Math.pow(a, 3);

                 message = "\n" + a + "      | " + squared + "      |  " + cubed;

                System.out.print(message);
            }

			//// sees if the user wants to continue
            System.out.print("\nContinue? (y/n): ");
            choice = keyboard1.next();
            System.out.println();

            if (choice.equals("n")) {
				System.out.println("\nThis program was written by Steven Lacy.");
				System.out.println("End of program.");
            }
        }

		long userGrade;

		Scanner keyboard2 = new Scanner(System.in);

		System.out.print("Next one? (y/n): ");
		choice = keyboard2.next();

		boolean confirmation = choice.equals("y");

		if (confirmation) {
			System.out.print("Input a numerical grade from 0 to 100\n");
			userGrade = keyboard2.nextLong();

			if (userGrade >= 88) {
				System.out.println("A");
			}
			else if (userGrade >= 80) {
				System.out.println("B");
			}
			else if (userGrade >= 67) {
				System.out.println("C");
			}
			else if (userGrade >= 60) {
				System.out.println("D");
			}
			else  {
				System.out.println("F");
			}
			System.out.println("\nThis program was written by Steven Lacy.");
			System.out.println("End of program.");
		}

	}//end method main

}    //end NumberOperations

