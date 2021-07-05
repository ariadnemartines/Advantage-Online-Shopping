package com.keeggo.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Annotation {

	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	

}
