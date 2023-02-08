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
		System.out.println("enter your mobileNumber:");
		String input = scanner.next();
		String regex = "(91)(-)[6-9]{1}+[0-9]{9}+$";
		//String regex = "[91]{2}+(-)+^[6-9]{1}+[0-9]{9}+$";
		userName(regex, input);

		if (input.matches(regex) == true)
			System.out.println("valid mobileNumber");
		else
			System.out.println("invalid mobileNumber");

	}
}