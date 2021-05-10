package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(36, RecursionMath.recursiveMultiplication(12, 3));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(2, RecursionMath.recursiveDivision(4, 2));
    	assertEquals(4, RecursionMath.recursiveDivision(20, 5));
        //fail("Write some tests!");
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(16, RecursionMath. recursivePower(4, 2));
    	assertEquals(9, RecursionMath. recursivePower(3, 2));
        //fail("Write some tests!");
    }
}
