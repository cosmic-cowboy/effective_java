package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations;

public enum Operation {

	PLUS("+"){
		@Override
		double apply(double x, double y) { return x + y;}
	},
	MINUS("-"){
		@Override
		double apply(double x, double y) { return x - y;}
	},
	TIMES("*"){
		@Override
		double apply(double x, double y) { return x * y;}
	},
	DIVIDE("/"){
		@Override
		double apply(double x, double y) { return x / y;}
	};
	
	/**
	 * 定数固定データ
	 */
	private final String symbol;
	
	/**
	 * 定数固定クラス
	 * @param symbol
	 */
	Operation(String symbol){
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
	
	/**
	 * 定数固定メソッド
	 * @param x
	 * @param y
	 * @return
	 */
	abstract double apply(double x, double y);
}
