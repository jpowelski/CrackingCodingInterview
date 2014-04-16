package main.ch1;

/**
 * Task: Design an algorithm and write code to remove the duplicate characters
 * in a string without using any-additional buffer. NOTE: One or two additional
 * variables are fine. An extra copy of array is not.
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task3 {

	public String removeDuplicateCharacters(String string) {
		char c1;
		int stringLength = string.length();
		for (int i = 0; i < stringLength; i++) {
			c1 = string.charAt(i);

			for (int j = i + 1; j < stringLength; j++) {
				if (c1 == string.charAt(j)) {
					string = string.substring(0, j) + string.substring(j+1);
					stringLength = string.length();
					i--;
					break;
				}

			}
		}
		return string;
	}

}
