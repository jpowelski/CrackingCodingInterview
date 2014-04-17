package main.ch1;

/**
 * Task: Write a method to replace all spaces in string with '%20'
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task5 {

	public String replaceSpaceWithHtmlCode(String string) {
		if (string == null) {
			return null;
		}

		StringBuilder result = new StringBuilder();

		for (char c : string.toCharArray()) {
			if (c == ' ') {
				result.append("%20");
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
}
