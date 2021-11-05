package grades;

import util.Input;

import java.util.HashMap;


public class GradesApplication {

	public static void main(String[] args) {

		Student student_1 = new Student("Steven");
		student_1.addGrade(75);
		student_1.addGrade(100);
		student_1.addGrade(87);

		Student student_2 = new Student("Skylar");
		student_2.addGrade(100);
		student_2.addGrade(98);
		student_2.addGrade(87);

		Student student_3 = new Student("Lizzy");
		student_3.addGrade(100);
		student_3.addGrade(75);
		student_3.addGrade(87);

		Student student_4 = new Student("Cooper");
		student_4.addGrade(48);
		student_4.addGrade(75);
		student_4.addGrade(87);

		HashMap<String, Student> students = new HashMap<>();

		students.put("Steven.lacy11", student_1);
		students.put("Skylar.lacy63", student_2);
		students.put("Lizzy.lacy99", student_3);
		students.put("Cooper.lacy12", student_4);

		Input input = new Input();

		String[] studentList = students.keySet().toArray(new String[0]);

		for (String user : studentList)
			System.out.println(user);

		do {
			System.out.print("Which student's info do you wanna look at?");

			String userInput = input.getString();
			Student target = students.get(userInput);

			if (students.containsKey(userInput)) {
				System.out.println("Name: " + target.getName() + "\nUserName: " + userInput +
						"\nCurrent Average: " + target.getGradeAverage());
				System.out.println("Would you like to continue?");
			}
			else {
				System.out.println("No students with that username were found.\n 	  Thank you. Have a nice day!");
				break;}
		} while (input.yesNo());
	}
}

