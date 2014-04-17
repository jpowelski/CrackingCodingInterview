package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task7Test {

	private int[][] excepted;
	private int[][] data;

	public Task7Test(int[][] excepted, int[][] data) {
		this.excepted = excepted;
		this.data = data;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays
				.asList(new Object[][] {
						{ new int[][] { { 1, 1 }, { 2, 2 } },
								new int[][] { { 1, 1 }, { 2, 2 } } },
						{ new int[][] { { 1, 0 }, { 0, 0 } },
								new int[][] { { 1, 1 }, { 2, 0 } } },
						{
								new int[][] { { 1, 1, 1 }, { 2, 2, 2 },
										{ 3, 3, 3 }, },
								new int[][] { { 1, 1, 1 }, { 2, 2, 2 },
										{ 3, 3, 3 } } },

						{
								new int[][] { { 1, 1, 0 }, { 2, 2, 0 },
										{ 0, 0, 0 }, },
								new int[][] { { 1, 1, 1 }, { 2, 2, 2 },
										{ 3, 3, 0 } } },
						{
								new int[][] { { 0, 0, 0 }, { 0, 0, 0 },
										{ 0, 0, 0 }, },
								new int[][] { { 0, 1, 1 }, { 2, 2, 2 },
										{ 3, 3, 0 } } } });
	}

	@Test
	public void test1() {
		assertEquals(
				true,
				Arrays.deepEquals(excepted,
						new Task7().clearRowAndColumnOn0(data)));
	}
}