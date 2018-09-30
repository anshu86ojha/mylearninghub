package com.mylearninghub.constants;

public class Constants {

	private static final String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	public static String getEmailRegex() {
		return emailRegex;
	}
}
