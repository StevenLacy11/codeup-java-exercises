public class StringExercise {


	public static void main(String[] args) {
		String string1, string2, string3, string4, string5, string6;

		string1 = "We don't need no education";
		string2 = "We don't need no thought control";
		string3 = "Check \"this\" out!, \"s inside of \"s!";
		string4 = "In windows, the main drive is usually C:\\";
		string5 = "I can do backslashes \\, double backslashes \\\\,";
		string6 = "and the amazing triple backslash \\\\\\!";

		System.out.printf("%s\n%s\n%n", string1, string2);
		System.out.printf("%s\n%n", string3);
		System.out.println(string4 + "\n");
		System.out.println(string5 + "\n" + string6);
	}
}