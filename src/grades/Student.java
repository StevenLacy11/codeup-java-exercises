package grades;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Integer> grades;

	public Student(String name) {
		this.name = name;
		this.grades = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addGrade(int grade) {
		grades.add(grade);
	}

	public int getGradeAverage() {
		int average = 0;
		for (Integer grade : grades) {
			average += grade;
		}
		return average / grades.size();
	}

	public static void main(String[] args) {
		Student student1 = new Student("Steven");
		student1.addGrade(50);
		student1.addGrade(100);
		System.out.println("Steven's average grade is " + student1.getGradeAverage());

		Student student2 = new Student("Skylar");
		student2.addGrade(100);
		student2.addGrade(98);
		System.out.println("Skylar's average grade is " + student2.getGradeAverage());

		Student student3 = new Student("Lizzy");
		student3.addGrade(100);
		student3.addGrade(75);
		System.out.println("Lizzie's average grade is " + student3.getGradeAverage());


		Student student4 = new Student("Cooper");
		student4.addGrade(48);
		student4.addGrade(75);
		student4.addGrade(87);
		System.out.println("Cooper's average grade is " + student4.getGradeAverage());


	}

}