package main.ch1;

/**
 * Task: Write an algorithm such that if an element in a MxN matrix is 0, its
 * entire row and column is set to 0.
 * 
 * @author Jêdrzej Powelski
 * 
 */
public class Task7 {

	public int[][] clearRowAndColumnOn0(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {

					for (int m = 0; m < array.length; m++) {
						array[m][j] = 0;
					}
					for (int n = 0; n < array[i].length; n++) {
						array[i][n] = 0;
					}
				}
			}
		}
		return array;
	}
}
