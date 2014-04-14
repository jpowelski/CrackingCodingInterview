package test.ch1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ch1.Task1;
import main.ch1.Task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Task2Test {

	private String excepted;
	private char[] characters;

	public Task2Test(String excepted, char[] characters) {
		this.excepted = excepted;
		this.characters = characters;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "", new char[] { '\0' } },
				{ "a", new char[] { 'a', '\0' } },
				{ "aa", new char[] { 'a', 'a', '\0' } },
				{
						"zyxwutsrponmlkjihgfedcba",
						new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
								'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r',
								's', 't', 'u', 'w', 'x', 'y', 'z', '\0' } },
				{ "Aa", new char[] { 'a', 'A', '\0' } },
				{ "acba", new char[] { 'a', 'b', 'c', 'a', '\0' } } });
	}


//	@Test
//	public void test2() {
//		System.out.println("test2: excepted = " + excepted + ", s = " + new String(characters));
//		assertEquals(excepted, new Task2().reverseString(new String(characters)));
//	}
	
	@Test
	public void test3() {
		System.out.println("test3: excepted = " + excepted + ", s = " + new String(characters));
		assertEquals(excepted, new Task2().reverseCString(characters));
	}
}