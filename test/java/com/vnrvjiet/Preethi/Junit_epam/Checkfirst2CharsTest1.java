package com.vnrvjiet.Preethi.Junit_epam;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Checkfirst2CharsTest1 {

	@Test
	 public void test4Chars() {
		CheckFirst2Chars check=new CheckFirst2Chars();
		String result=check.Check("ABCD");
		assertEquals("BCD",result);
	}
	@Test
	 public void test4Chars1() {
			CheckFirst2Chars check=new CheckFirst2Chars();
			String result=check.Check("AACD");
			assertEquals("CD",result);
		}
	@Test
	 public void test4Chars2() {
			CheckFirst2Chars check=new CheckFirst2Chars();
			String result=check.Check("BACD");
			assertEquals("BCD",result);
		}
	@Test
	 public void test4Chars3() {
			CheckFirst2Chars check=new CheckFirst2Chars();
			String result=check.Check("BBAA");
			assertEquals("BBAA",result);
		}
	@Test
	 public void test4Chars4() {
			CheckFirst2Chars check=new CheckFirst2Chars();
			String result=check.Check("AABAA");
			assertEquals("BAA",result);
		}
}
	
