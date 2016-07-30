package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@BeforeClass
	public static void beforClasExamaple(){
		
	}
	
	@AfterClass
	public static void afterClasExample(){
		
	}
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.sum(z1, z2);
		
		Assert.assertEquals(3.4, wynik, 0.001);
		
		
		
	}
	
	@Test
	public void test2() throws Exception {
		
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.subtract(z1, z2);
		
		Assert.assertEquals(wynik, 0.4, 001);
		
	}
	
	@Test
	public void test3() throws Exception {
		
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.multiply(z1, z2);
		
		Assert.assertEquals(wynik, 2.85, 001);
		
	}
	
	@Test
	public void test4() throws Exception {
		
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.multiply(z1, z2);
		
		Assert.assertEquals(wynik, 2.66, 001);
		
	}
	
	@Test(expected = Exception.class)
	public void test5() throws Exception {
		
		double z1 = 1.9;
		double z2 = 0;
		
		double wynik = classUnderTest.multiply(z1, z2);
		
		
		
	}


}
