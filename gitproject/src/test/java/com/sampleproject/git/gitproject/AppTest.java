package com.sampleproject.git.gitproject;

import org.testng.annotations.*;


/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test (timeOut=240000)
    
    public void add() throws Exception {

		int a = 10;
		int b= 20;
		System.out.println(a+b);
		System.out.println("Hello World");
	}

}
