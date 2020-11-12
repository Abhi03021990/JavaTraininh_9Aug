package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytest1 {
	
	@BeforeSuite
	public void testBase() {
		System.out.println("running bfore suite");
	}
	@BeforeClass
	public void preRequisite() {
		System.out.println("running before class");
	}
	@BeforeTest
	public void setup() {
		System.out.println("Running before test");
	}
	@BeforeMethod
	public void initialize() {
		System.out.println("running before method");
	}
	@Test
	public void test1() {
		System.out.println("running test1");
	}
	@Test
	public void test2() {
		System.out.println("running test2");
	}
	@AfterMethod
	public void aM() {
		System.out.println("running after method");
	}
	@AfterTest
	public void m1() {
		System.out.println("running after test method");
	}
	@AfterClass
	public void m2() {
		System.out.println("running after class");
	}
	@AfterSuite
	public void m3() {
		System.out.println("Running after suite");
	}
	
}
