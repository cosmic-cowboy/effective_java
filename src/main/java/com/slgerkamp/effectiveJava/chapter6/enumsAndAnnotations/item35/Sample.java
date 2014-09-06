package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item35;

import org.junit.Test;

public class Sample {

	@Test
	public void m1(){}
	
	public static void m2(){}

	@Test
	public void m3(){
		throw new RuntimeException("boom");
	}

	public static void m4(){}

	// static methodは受け付けない
//	@Test
//	public static void m5(){}

	public static void m6(){}

	@Test
	public void m7(){
		throw new RuntimeException("Crash");
	}

}
