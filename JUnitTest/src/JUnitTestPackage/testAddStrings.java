package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	@Test
	public void test() { 
		 JUnitFunctions ob = new JUnitFunctions();
		 String a,b;
		 a="Good ";
		 b="Morning";
		 String res=ob.addstring(a,b);
		 assertEquals("Good Morning",res);
	}
}