import java.util.Scanner;

public class Bob {
	public static void main(String[] args) {


		// declare variables to be used
		String response, response1, response2, response3, response4;
		int selection;
		boolean done, invalidChoice;


		// assign the following variables
		selection = 0;
		done = false;
		invalidChoice = false;

		// instantiate an object from the
		// Scanner class to enable reading
		// in from the keyboard
		Scanner keyboard = new Scanner(System.in);


		System.out.println("Lets talk with Bob");

		response1 = "'Sure.'";
		response2 = "'Whoa, chill out!'";
		response3 = "'Fine. Be that way!'";
		response4 = "'Whatever.'";

		// iterate through while loop until
		// user wants to exit the program
		// for your condition use the expression
		// (done not equal to true)
		while (!done) {
			// print out menu for the user
			// to select from
			System.out.println("\nPlease select what to do with Bob" + "\n");
			System.out.println("1 - Ask Bob a question.");
			System.out.println("2 - Yell at Bob.");
			System.out.println("3 - Address him without actually saying anything.");
			System.out.println("4 - Do anything else.");
			System.out.println("5 - exit\n");

			// read in from the keyboard what
			// the user has entered
			selection = keyboard.nextInt();

			// using nested if statements, determine what
			// selection the user has selected

			if (selection == 1) //ask a question
			{
				System.out.println(response1);
				invalidChoice = false;
			} else if (selection == 2) //yell at bob
			{
				System.out.println(response2);
				invalidChoice = false;
			} else if (selection == 3) //say nothing
			{
				System.out.println(response3);
				invalidChoice = false;
			} else if (selection == 4)//anything else
			{
				System.out.println(response4);
				invalidChoice = false;
			} else if (selection == 5) //exit program
			{
				done = true;
				invalidChoice = false;
			} else    //invalid choice
			{
				invalidChoice = true;
				System.out.println("\n***ERROR*** " +
						selection +
						" is not a valid selection. " +
						"Please try again!");
			}

			// using nested if statements, determine
			// the type of output to produce

			if (!invalidChoice) {
				System.out.println();
			} else {
				System.out.println("\nNo response.");
			}
		}    //end while loop

		System.out.println("\nThis program was written by Steven Lacy");
		System.out.println("End of program.");

	} // end Main method
} // end class Bob
