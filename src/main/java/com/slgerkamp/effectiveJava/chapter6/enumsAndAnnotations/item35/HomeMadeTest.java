package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class HomeMadeTest {

	public static void main(String[] args)  throws Exception{
		
		final String className = "com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item35.Sample";
		
		int tests = 0;
		int passed = 0;
		
		Class<?> testClass = Class.forName(className);
		
		for(Method m : testClass.getDeclaredMethods()){
			
			if(m.isAnnotationPresent(Test.class)){
				tests++;
					try {
						m.invoke(null);
						passed++;
					} catch (InvocationTargetException e) {
						e.printStackTrace();
						System.err.println(m + " failed : " + e);
					} catch (Exception e){
						e.printStackTrace();
						System.err.println("INVALID @Test : " + m);
					}
			}
		}
		System.out.printf("Passed : %d , Failed : %d%n", passed, tests - passed);
	}
}
