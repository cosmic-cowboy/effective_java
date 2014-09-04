package com.slgerkamp.effectiveJava.chapter6.enumsAndAnnotations.item34;

/**
 * 拡張可能なenumを擬似的に作成するためのインタフェース
 *
 */
public interface InterfaceOperation {
	
	/**
	 * 継承するメソッド
	 * @param x
	 * @param y
	 * @return
	 */
	double apply(double x, double y);
}
