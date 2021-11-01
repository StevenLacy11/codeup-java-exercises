
import java.util.Arrays;

public class ArraysExercises {

	public static Person[] addPerson(Person[] arr, Person newPerson) {
		Person[] newArray = Arrays.copyOf(arr, arr.length + 1);
		newArray[arr.length] = newPerson;
		return newArray;
	}


	public static void main(String[] args) {

//  Creating new instances of Person objects from Person class in src folder.
		Person firstPerson = new Person("Lizzy");
		Person secondPerson = new Person("Skylar");
		Person thirdPerson = new Person("Steven");


//  Creating array containing each person
		Person[] people = new Person[3];
		people[0] = firstPerson;
		people[1] = secondPerson;
		people[2] = thirdPerson;

//  Iterate over each person object
		for (Person person : people) {
//  Utilizing the getName() method from Person class
			System.out.println(person.getName());
		}

		Person fourthPerson = new Person("Stella");
		people = addPerson(people, fourthPerson);

		Person fifthPerson = new Person("Cooper");
		people = addPerson(people, fifthPerson);

		for (Person person : people) {
//  Utilizing the getName() method from Person class
			System.out.println(person.getName());
		}

	}
}