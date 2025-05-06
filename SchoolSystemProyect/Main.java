
public class Main {

	public static void main(String[] args) {
		Course course= new Course("Química","Marie Curie", 2025);
		
		//course.enroll(new Student("Isaac", "Mendez", 2020, 97, 2025));
		//course.enroll(new Student("Ana", "Garcia", 2020, 89, 2025));
		//course.enroll(new Student("Eduardo", "Martínez", 2020, 75, 2025));
		//course.enroll(new Student("Gabriela", "Ordoñez", 2020, 91, 2025));

		
		Student[] students = {
		new Student("Isaac", "Mendez", 2020, 97, 2025),
		new Student("Ana", "Garcia", 2020, 89, 2025),
		new Student("Eduardo", "Martínez", 2020, 75, 2025),
		new Student("Gabriela", "Ordoñez", 2020, 91, 2025)
		};
		
		course.enroll(students);
		
		System.out.println("Total: " + course.countStudents()); //4
		System.out.println(course.bestGrade());
	
		course.students.get(0).printFullName();
		System.out.println("changeYearIfApproved: " + course.students.get(0).changeYearIfApproved());
		
		course.students.get(1).printFullName();
		System.out.println(course.students.get(1).changeYearIfApproved());

	}//main

}//class main
