package qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Exam {
	@Autowired
	@Qualifier("student1")
	private Student student;

	public Exam() {
		System.out.println("exam constructor.");
	}

	public void printAge() {
		System.out.println("Age : " + student.getAge());
	}

	public void printName() {
		System.out.println("Name : " + student.getName());
	}
}