package main.ch1;

/**
 * Task: Assume you have a method isSubstring which checks if one word is a
 * substring of another. Given two strings, s1 and s2, write code to check if s2
 * is a rotation of s1 using only one call to isSubstring (i.e. "waterbottle"is
 * rotation of erbottlewat").
 * 
 * @author Jedrzej Powelski
 * 
 */
public class Task8 {

	public boolean isRotation(String original, String rotation) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < original.length(); i++) {
			sb.append(original.substring(i, original.length()));
			sb.append(original.substring(0, i));
			sb.append(" ");
		}

		return isSubstring(sb.toString(), rotation);
	}

	private boolean isSubstring(String bigger, String smaller) {
		return bigger.indexOf(smaller) != -1;
	}
}
