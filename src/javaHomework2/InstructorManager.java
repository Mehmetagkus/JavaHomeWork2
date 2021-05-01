package javaHomework2;

public class InstructorManager extends UserManager {

	public void courseAdd(Instructor instructor) {
		System.out.println(instructor.getCourses() + " kursu başarıyla eklendi.");
	}

	public void courseRemove(Instructor instructor) {
		System.out.println(instructor.getCourses() + " kursu başarıyla kaldırıldı.");
	}
}
