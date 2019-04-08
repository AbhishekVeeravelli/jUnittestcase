package jUnittestcasepackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testaddnumbers {

	@Test
	public void test() {
		jUnittestcasefunction junit=new jUnittestcasefunction();
		int result=junit.addnumbers(100,200);
		assertEquals(300,result); 
	}

}
