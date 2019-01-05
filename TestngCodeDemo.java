package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngCodeDemo {
	@Test
	public void testMeth(){
		System.out.println("running testng");
		Assert.fail();
	}

}
