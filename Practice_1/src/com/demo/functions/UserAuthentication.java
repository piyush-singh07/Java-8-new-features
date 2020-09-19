package com.demo.functions;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthentication {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the username :");
		String user= sc.next();
		System.out.println("Enter the password :");
		String pass= sc.next();
		Function<String , String> f1= s -> s.toLowerCase();
		Function<String, String> f2 = s-> s.substring(0, 5);
		
		if(f1.andThen(f2).apply(user).equals("durga") && pass.equals("java"))
			System.out.println("Valid User");
		else
			System.out.println("Invalid User");
		
		
		
	}

}
