public class Person{


	private String name;
	protected int age;
	public Person(){}


	public Person(String name){
		this.name = name;
	}

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		//TODO: change the name property to the passed value
		this.name = name;
	}

	public void sayHello(){
	//TODO: print a message to the console using the person's name
		System.out.println("Good day, " + name);
	}



	public static void main(String[] args) {
		Person steven = new Person("Steven");
		steven.sayHello();
		steven.setName("Skylar");
		steven.sayHello();

//		Person person1 = new Person("John");
//		Person person2 = new Person("John");
//		System.out.println(person1.getName().equals(person2.getName()));
//		System.out.println(person1 == person2);

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2);
//
//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
//		person2.setName("Jane");
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
	}

}














