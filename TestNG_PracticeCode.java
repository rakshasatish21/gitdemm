package com.testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNG_PracticeCode {
@Test
public void testMethod(){
	TestNG test=new TestNG();
	List<String> lst=new ArrayList<String>();
	lst.add("C:\\Users\\Administrator\\Desktop\\TestYantra_Practice\\TestYantraFrameWork\\test-output\\testng-failed.xml");
	test.setTestSuites(lst);
	test.run();
}
}
