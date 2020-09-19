package com.demo.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {

	private static Scanner sc;

	public static void main(String[] args) {
		
		Predicate<User> p= user-> user.username.equals("durga")&& user.password.equals("java");
		sc = new Scanner(System.in);
		System.out.println("Enter the username :");
		String uname= sc.next();
		System.out.println("Enter the password :");
		String pwd= sc.next();
		User us= new User(uname, pwd);
		if(p.test(us))
			System.out.println("U are authenticated");
		else
			System.out.println("U are not authenticated");
		

	}

}

class User
{
	 String username;
	 String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	
	
}
