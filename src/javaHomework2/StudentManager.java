package javaHomework2;

public class StudentManager extends UserManager {

	public void courseAdd(Student student) {
		System.out.println(student.getCourses() + " kursunu aldınız.");
	}

	public void courseRemove(Student student) {
		System.out.println(student.getCourses() + " kursunu kalırdınız.");
	}
}
