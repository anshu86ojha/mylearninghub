package com.mylearninghub.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mylearninghub.constants.*;

public class StringUtilities {

	public static String removeNumbersFromString(String string) {
		return string.replaceAll("\\d.", "");
	}

	public static boolean checkValideEmailPattern(String string) {
		Pattern pattern;
		pattern = Pattern.compile(Constants.getEmailRegex());
		Matcher matcher = pattern.matcher(string);

		return matcher.matches();
	}

}
