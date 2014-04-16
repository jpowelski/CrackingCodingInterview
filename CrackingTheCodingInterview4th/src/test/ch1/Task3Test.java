package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task3Test {

	private String excepted;
	private String data;

	public Task3Test(String excepted, String data) {
		this.excepted = excepted;
		this.data = data;
	}

	@Parameters
	public static Collection<String[]> data() {
		return Arrays
				.asList(new String[][] { { "", "" }, { "a", "a" },
						{ "a", "aa" }, { "a", "aaa" }, { "abc", "abc" },
						{ "ab", "aba" }, { "ab", "abab" }, { "ab", "aabb" },
						{ "abc", "aabbcc" }, { "abc", "abcabc" },
						{ "abcde", "aabbccaabbccddeeaa" },
						{ "abcd", "abcdacbdcddbba" } });
	}

	@Test
	public void test1() {
		System.out
				.println("test1: excepted = " + excepted + ", data = " + data);
		assertEquals(excepted, new Task3().removeDuplicateCharacters(data));
	}
}