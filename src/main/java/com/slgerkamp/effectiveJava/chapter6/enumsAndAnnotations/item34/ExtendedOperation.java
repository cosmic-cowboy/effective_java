package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item34;

/**
 * 拡張演算処理
 *
 */
public enum ExtendedOperation implements InterfaceOperation{
	
	/**
	 * 累乗
	 */
	EXP("^"){
		public double apply(double x, double y) { return Math.pow(x, y);}
	},
	
	/**
	 * 剰余
	 */
	REMAINDER("%"){
		public double apply(double x, double y) { return x % y;}
	};
	
	/**
	 * 定数固定データ
	 */
	private final String symbol;
	
	/**
	 * 定数固定クラス
	 * @param symbol
	 */
	ExtendedOperation(String symbol){
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
}
