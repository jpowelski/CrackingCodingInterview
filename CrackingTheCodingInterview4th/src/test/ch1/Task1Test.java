package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Task1Test {

	private boolean excepted;
	private String s;

	public Task1Test(boolean excepted, String s) {
		this.excepted = excepted;
		this.s = s;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { true, "" }, { true, "a" },
				{ true, "abc" }, { false, "aa" },
				{ true, "abcdefghijklmnoprstuwxyz" }, { true, "aA" },
				{ false, "abca" } });
	}


	@Test
	public void test1() {
		System.out.println("test1: excepted = " + excepted + ", s = " + s);
		assertEquals(excepted, new Task1().hasUniqueCharacters1(s));
	}
	
	@Test
	public void test2() {
		System.out.println("test2: excepted = " + excepted + ", s = " + s);
		assertEquals(excepted, new Task1().hasUniqueCharacters2(s));
	}
}