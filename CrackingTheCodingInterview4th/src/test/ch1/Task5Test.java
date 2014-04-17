package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task5Test {

	private String excepted;
	private String data;

	public Task5Test(String excepted, String data) {
		this.excepted = excepted;
		this.data = data;
	}

	@Parameters
	public static Collection<String[]> data() {
		return Arrays
				.asList(new String[][] { { null, null }, { "", "" },
						{ "a", "a" }, { "a%20a", "a a" },{ "a%20a%20a%20a", "a a a a" },
						{ "%20%20%20aaa", "   aaa" } });
	}

	@Test
	public void test1() {
		System.out
				.println("test1: excepted = " + excepted + ", data = " + data);
		assertEquals(excepted, new Task5().replaceSpaceWithHtmlCode(data));
	}
}