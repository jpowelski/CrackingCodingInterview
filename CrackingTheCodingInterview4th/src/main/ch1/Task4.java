package main.ch1;

/**
 * Task: Write a method to decide if two strings are anagrams or not.
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task4 {

	public boolean areAnagrams(String first, String second){
		if (first == null || second == null){
			return false;
		}
		if(first.length() != second.length()){
			return false;
		}
		int[] firstCharacters = new int[255];
		int[] secondCharacters = new int[255];
	
		for (char c: first.toCharArray()){
			firstCharacters[(int)c]++;
		}
		
		for (char c: second.toCharArray()){
			secondCharacters[(int)c]++;
		}
		
		for(int i=0;i<255;i++){
			if (firstCharacters[i] != secondCharacters[i]){
				return false;
			}
		}
		return true;
	}
}
