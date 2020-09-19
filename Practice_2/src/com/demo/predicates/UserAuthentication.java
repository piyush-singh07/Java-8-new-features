package com.demo.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	private static Scanner sc;

	public static void main(String[] args) {

		Predicate<User> p1 = user -> user.getUsername().equals("durga") && user.getPassword().equals("durga");
		sc = new Scanner(System.in);
		System.out.println("Enter username :");
		String uname = sc.next();
		System.out.println("Enter password :");
		String upwd = sc.next();
		User u = new User(uname, upwd);
		if (p1.test(u)) {
			System.out.println("Authenticated User");
		} else {
			System.out.println("Go to hell!!!");
		}
		 

	}

}

class User {
	private String username;
	private String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
