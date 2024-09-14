package tdd.code.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import tdd.code.maven.calculator.StringCalculator;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Simple test to assert that true is indeed true.
     */
    @Test
    public void testApp() {
        assertTrue(true, "This test will always pass");
    }
    
    /**
     * Test an empty string should return 0
     */
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
    
    /**
     * Test for a Single Number
     */
    @Test
    public void testSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }
    
    /**
     * Test for Two Numbers
     */
    @Test
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }
    
    /**
     * Test for Multiple Numbers
     */
    @Test
    public void testMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }
    
    /**
	 * Test for Newline Delimiters
	 */
    @Test
    public void testCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(7, calculator.add("1\n3,3"));
    }
    
    /**
     * Test for Multiple Custom Delimiters
     */
    @Test
    public void testMultiCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(7, calculator.add("//;\n3;4"));
    }
}
