package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testAdd2plus2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(2, 2), 4);
	}
	
	@Test
	public void testminus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	@Test
	public void testminus5minus1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 1), 4);
	}
		
	

	@Test
	public void testmultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	@Test
	public void testmultiply5mulitply2() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 2), 10);
	}
		
	@Test
	public void testdivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 2), 2);
	}
	
	@Test
	public void testdividebyZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 0), 0);
	}
	
// last curly bracket for code 	
}
