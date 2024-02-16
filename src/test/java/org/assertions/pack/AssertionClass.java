package org.assertions.pack;

import org.junit.Test;

import junit.framework.Assert;



public class AssertionClass {
	@Test
	public void test1TitileVerfify1() {
		String expected = "Aiite academy";
		String actual  = "Aiiteacademy";
		if(expected.equals(actual) == true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		System.out.println("Usual method execution ");
	}
	
	@Test
	public void test1TitileVerfify2() {
		String expected = "Aiite academy";
		String actual  = "Aiiteacademy";
		Assert.assertEquals(expected, actual);//It will indicate failure on the JUnit o/p side before both values are not equals
		//If those two values are equals, the test case will successfully execute.
		System.out.println("assertEquals method execution");
		
		
		
	}
	

	@Test
	public void test1TitileVerfify3() { //assertTrue() method
		String expected = "Aiite academy";
		String actual  = "Aiiteacademy";
		Assert.assertTrue(expected.contains("Aiite")); // assertTrue methods expected a boolean value. If the boolean value is true
		//the test case will execute. If not, it won't execute and we will get failure on the JUnit dashboard.
		System.out.println("assertTrue method execution");
	}
	
	@Test
	public void test1TitileVerfify4() { //assertFalse
		String expected = "Aiite academy";
		String actual = "AiiteAcademy";
		Assert.assertFalse(actual, false); //assertFalse expects a boolean value of false. It it gets false, the test case will be executed
		//If not, it won't executed and we'll get failure on the JUnit dashboard
		System.out.println("Falis");
		System.out.println("assertFalse method execution");
	}
	

}
