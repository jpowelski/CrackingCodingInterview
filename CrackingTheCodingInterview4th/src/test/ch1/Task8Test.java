package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task8Test {

	private boolean expected;
	private String original;
	private String rotation;

	public Task8Test(boolean expected, String original, String rotation) {
		this.expected = expected;
		this.original = original;
		this.rotation = rotation;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { true, "", "" },
				{ true, "a", "a" }, { true, "waterbottle", "erbottlewat" },
				{ true, "1234567890", "4567890123" },
				{ false, "1234567890", "4467890123" },
				{ false, "aabbccdd", "abcd" }, { false, "abc", "1" },
				{ false, "abc", "123" }, { false, "abc", "bac" } });
	}

	@Test
	public void test1() {
		assertEquals(expected, new Task8().isRotation(original, rotation));
	}
}