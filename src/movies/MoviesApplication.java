package movies;

import java.util.Scanner;

public class MoviesApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean moviesRunning = true;
		do {
			System.out.println("""
					What would you like to do?\s

					0 - exit
					1 - view all movies
					2 - view movies in the animated category
					3 - view movies in the drama category
					4 - view movies in the horror category
					5 - view movies in the sci-fi category
					""");
			int userInput = scanner.nextInt();

			if (userInput == 0) {
				moviesRunning = false;
				System.out.println("See you next time!");
			}
			if (userInput == 1) {
				for (Movie movie : MoviesArray.findAll()) {
					System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
				}
			}
			if (userInput == 2) {
				System.out.println(getCategory("animated"));
			}
			if (userInput == 3) {
				System.out.println(getCategory("drama"));
			}
			if (userInput == 4) {
				System.out.println(getCategory("comedy"));
			}
			if (userInput == 5) {
				System.out.println(getCategory("sci-fi"));
			}
		} while (moviesRunning);

	}

	public static String getCategory(String category) {
		StringBuilder result = new StringBuilder();
		for (Movie movie : MoviesArray.findAll()) {
			if (movie.getCategory().equalsIgnoreCase(category)) {
				result.append(movie.getName()).append(" | ").append(movie.getCategory()).append("\n");
			}
		}
		return result.toString();
	}
}
