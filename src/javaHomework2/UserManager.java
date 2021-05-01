package javaHomework2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(
				"Tebrikler! " + user.getFirstName() + " " + user.getLastName() + " kodlama.io'ya üye oldunuz.");
	}

	public void login(User user) {
		System.out.println("Kodlama.io'ya hoş geldiniz. " + user.getFirstName() + " " + user.getLastName()
				+ " olarak giriş yapıldı. İyi dersler :)");
	}

	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " hesabından çıkış yapıldı.");
	}
}
