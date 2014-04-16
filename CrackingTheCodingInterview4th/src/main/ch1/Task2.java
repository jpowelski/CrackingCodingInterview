package main.ch1;

/**
 * Task: Write code to reverse a C-Style String. (C-String means that "abcd" is
 * represented as five characters, including the null character.)
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task2 {

	public String reverseCString(char[] characters) {
		int lenght = characters.length - 1;
		if (characters[lenght] != '\0'){
			lenght--;
		}
		char[] reversedCharacters = new char[lenght];
		int tail = lenght - 1;
		for (char c : characters) {
			if (c != '\0') {
				reversedCharacters[tail] = c;
				tail--;
			}
		}
		return new String(reversedCharacters);
	}
}
