package jUnittestcasepackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnittestcasefunction junit=new jUnittestcasefunction();
		String result=junit.addstrings("Abhishek","Veeravelli");
		assertEquals("AbhishekVeeravelli",result);
	}

}
