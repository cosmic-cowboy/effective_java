package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item34;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Enclosed.class)
public class ExtendedOperationTest {
	
	@RunWith(Theories.class)
	public static class 足し算を行うテスト{
		
		@DataPoints
		public static Fixture[] FIXTURES = {
			new Fixture(2.000000, 4.000000, "+", 6.000000)
		};
		
		@Theory
		public void 足し算を行う(Fixture f){
			assertThat(BasicOperation.PLUS.toString(), is(f.operator));
			assertThat(BasicOperation.PLUS.apply(f.first_operand, f.second_operand), is(f.answer));
		}
	}
	
	@RunWith(Theories.class)
	public static class 引き算を行うテスト{
		
		@DataPoints
		public static Fixture[] FIXTURES = {
			new Fixture(2.000000, 4.000000, "-", -2.000000)
		};
		
		@Theory
		public void 引き算を行う(Fixture f){
			assertThat(BasicOperation.MINUS.toString(), is(f.operator));
			assertThat(BasicOperation.MINUS.apply(f.first_operand, f.second_operand), is(f.answer));
		}
	}
	
	@RunWith(Theories.class)
	public static class 掛け算を行うテスト{
		
		@DataPoints
		public static Fixture[] FIXTURES = {
			new Fixture(2.000000, 4.000000, "*", 8.000000)
		};
		
		@Theory
		public void 掛け算を行う(Fixture f){
			assertThat(BasicOperation.TIMES.toString(), is(f.operator));
			assertThat(BasicOperation.TIMES.apply(f.first_operand, f.second_operand), is(f.answer));
		}
	}
	
	@RunWith(Theories.class)
	public static class 割り算を行うテスト{
		
		@DataPoints
		public static Fixture[] FIXTURES = {
			new Fixture(4.000000, 2.000000, "/", 2.000000)
		};
		
		@Theory
		public void 割り算を行う(Fixture f){
			assertThat(BasicOperation.DIVIDE.toString(), is(f.operator));
			assertThat(BasicOperation.DIVIDE.apply(f.first_operand, f.second_operand), is(f.answer));
		}
	}
	
	@RunWith(Theories.class)
	public static class 累乗を行うテスト{
		
		@DataPoints
		public static Fixture[] FIXTURES = {
			new Fixture(2.000000, 4.000000, "^", 16.000000)
		};
		
		@Theory
		public void 累乗を行う(Fixture f){
			assertThat(ExtendedOperation.EXP.toString(), is(f.operator));
			assertThat(ExtendedOperation.EXP.apply(f.first_operand, f.second_operand), is(f.answer));
		}
	}
	
	@RunWith(Theories.class)
	public static class 剰余を行うテスト{
		
		@DataPoints
		public static Fixture[] FIXTURES = {
			new Fixture(3.000000, 2.000000, "%", 1.000000)
		};
		
		@Theory
		public void 剰余を行う(Fixture f){
			assertThat(ExtendedOperation.REMAINDER.toString(), is(f.operator));
			assertThat(ExtendedOperation.REMAINDER.apply(f.first_operand, f.second_operand), is(f.answer));
		}
	}	
	
	
	
	static class Fixture {
		double first_operand;
		double second_operand;
		String operator;
		double answer;
		
		public Fixture(double first_operand, double second_operand,
				String operator, double answer) {
			this.first_operand = first_operand;
			this.second_operand = second_operand;
			this.operator = operator;
			this.answer = answer;
		}
		
		@Override
		public String toString() {
			return String.format("when first_operand =%s, second_operand=%s, operator=%s, answer=%s", first_operand, second_operand, operator, answer);
		}
	}
}
