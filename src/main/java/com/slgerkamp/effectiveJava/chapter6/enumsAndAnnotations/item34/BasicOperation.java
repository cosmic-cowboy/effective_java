package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item34;

/**
 * 基本演算処理
 *
 */
public enum BasicOperation implements InterfaceOperation{

	PLUS("+"){
		public double apply(double x, double y) { return x + y;}
	},
	MINUS("-"){
		public double apply(double x, double y) { return x - y;}
	},
	TIMES("*"){
		public double apply(double x, double y) { return x * y;}
	},
	DIVIDE("/"){
		public double apply(double x, double y) { return x / y;}
	};
	
	/**
	 * 定数固定データ
	 */
	private final String symbol;
	
	/**
	 * 定数固定クラス
	 * @param symbol
	 */
	BasicOperation(String symbol){
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}

}
