package com.bridgelabz.regexProblems;

import java.util.regex.*;
import java.util.*;

public class UserRegistration {

	static boolean userName(String regex, String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		System.out.println("welcome to User Registration program");

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your email:");
		String input = scanner.next();
		String regex = "^[a-z]{3,}+[.]+([a-z]{3,})*@+[a-z.]{3,}+[a-z.]{3,}+([a-z]{2,})*$";
		userName(regex, input);

		if (input.matches(regex) == true)
			System.out.println("valid email");
		else
			System.out.println("invalid email");

	}
}
