import java.util.Random;

public class ServerNameGenerator {
	static String[] adjectives = {"able", "blushing", "lively", "nonstop", "painstaking", "quick", "small", "spotless", "square", "white"};

	static String[] nouns = {"atmosphere", "country", "device", "insect", "internet", "leader", "newspaper", "problem", "restaurant", "shopping"};

	public static void randomServerName() {

		Random rand = new Random();
		int answer = rand.nextInt(10);
		Random rand2 = new Random();
		int answer2 = rand.nextInt(10);
		System.out.println("Here is your server name:\n" + adjectives[answer] + "-" + nouns[answer2]);
	}

	public static void main(String[] args) {
		randomServerName();
	}

}


