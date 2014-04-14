package main.ch1;

import java.util.HashSet;
import java.util.Set;

/**
 * Task: Implement an algorithm to determine if a string has all unique
 * characters. What if you can not use additional data structure.
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task1 {
	
	public boolean hasUniqueCharacters1(String string) {
		Set<Character> characters = new HashSet<>();
		for (char c : string.toCharArray()) {
			if (characters.contains(c)) {
				return false;
			}
			characters.add(c);
		}
		return true;
	}
	
	public boolean hasUniqueCharacters2(String string){
		char[] characters = new char[256];
		for (char c : string.toCharArray()) {
			if (characters[(int)c] != 0) {
				return false;
			}
			characters[(int)c] = c;
		}
		return true;
	}
}
