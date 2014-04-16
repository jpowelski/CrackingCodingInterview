package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task4Test {

	private boolean expected;
	private String first;
	private String second;

	public Task4Test(boolean expected, String first, String second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { false, null, null },
				{ false, null, "" }, { true, "", "" }, { true, "a", "a" },
				{ false, "a", "aa" }, { false, "a", "aaa" },
				{ true, "abc", "abc" }, { false, "ab", "aba" },
				{ true, "abba", "abab" }, { true, "abab", "aabb" },
				{ true, "abcabc", "aabbcc" }, { false, "abc", "ABC" } });
	}

	@Test
	public void test1() {
		System.out.println("test1: expected = " + expected + ", first = "
				+ first + ", second = " + second);
		assertEquals(expected, new Task4().areAnagrams(first, second));
	}
}