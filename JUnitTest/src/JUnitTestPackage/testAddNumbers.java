package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
@Test
	public void test() {
		    assertEquals(300,JUnitFunctions.addnum(100,200));
	}

}