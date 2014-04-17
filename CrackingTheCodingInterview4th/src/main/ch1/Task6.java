package main.ch1;

/**
 * Task: Given in image represented by an NxN matrix, where each pixel in the
 * image is 4 bytes, write a method to rotate the image by 90 degress. Can you
 * do this in place?
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task6 {

	public int[][] rotateNxNArray(int[][] array) {
		int n = array.length;
		int[][] result = new int[n][];
		for (int i = 0; i < n; i++) {
			result[i] = new int[n];
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[j][n -1 - i] = array[i][j];
			}
		}
		return result;
	}
}
