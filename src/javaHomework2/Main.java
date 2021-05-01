package javaHomework2;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "123456",
				"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");

		System.out.println("Eğitimci adı : " + instructor1.getFirstName());
		System.out.println("Eğitimci soyadı : " + instructor1.getLastName());
		System.out.println("Kullanıcı adı : " + instructor1.getUserName());
		System.out.println("Şifre : " + instructor1.getPassword());
		System.out.println("Verdiği kurs : " + instructor1.getCourses() + "\n");

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		userManager.addUser(instructor1);
		userManager.login(instructor1);
		System.out.println();
		instructorManager.courseAdd(instructor1);
		System.out.println();
		userManager.logout(instructor1);
		System.out.println("\n");

		Student student1 = new Student(1, "Mehmet", "Ağkuş", "mehmetagkus376@gmail.com", "654321",
				"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");

		System.out.println("\nÖğrenci adı : " + student1.getFirstName());
		System.out.println("Öğrenci soyadı : " + student1.getLastName());
		System.out.println("Kullanıcı adı : " + student1.getUserName());
		System.out.println("Şifre : " + student1.getPassword());
		System.out.println("Aldığı kurs : " + student1.getCourses() + "\n");

		StudentManager studentManager = new StudentManager();
		userManager.addUser(student1);
		userManager.login(student1);
		System.out.println();
		studentManager.courseAdd(student1);
		System.out.println();
		studentManager.courseRemove(student1);
		System.out.println();
		userManager.logout(student1);

	}

}
