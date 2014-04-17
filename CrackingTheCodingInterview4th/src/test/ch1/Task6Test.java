package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task6Test {

	private int[][] excepted;
	private int[][] data;

	public Task6Test(int[][] excepted, int[][] data) {
		this.excepted = excepted;
		this.data = data;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays
				.asList(new Object[][] {
						{ new int[][] { { 2, 1 }, { 2, 1 } },
								new int[][] { { 1, 1 }, { 2, 2 } } },
						{
								new int[][] { { 3, 2, 1 }, { 3, 2, 1 },
										{ 3, 2, 1 }, },
								new int[][] { { 1, 1, 1 }, { 2, 2, 2 },
										{ 3, 3, 3 } } } });
	}

	@Test
	public void test1() {
		assertEquals(true, Arrays.deepEquals(excepted, new Task6().rotateNxNArray(data)));
	}
}