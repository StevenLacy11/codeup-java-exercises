public class Employee extends Person {


	public Employee(String employeeName) {
		super(employeeName); // calling the constructor method from Person - Person(employeeName)
	}

	public int getAge() {

		return this.age;
	}

	public void sayHello(){

		System.out.println("Welcome to MegaCorp - how may I help you?");
	}

	public void doWork(){

		System.out.println("Work, Work, Work");
	}

	public static void main(String[] args) {

		Person unemployedSteven = new Person("Stephen");
		unemployedSteven.sayHello();

		Employee steven = new Employee("Steven");
		steven.sayHello();
		System.out.println("steven.name = " + steven.getName());

		steven.doWork();
	}


}
