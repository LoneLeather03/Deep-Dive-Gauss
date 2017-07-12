/**
 * 
 */
package edu.cnm.deepdive.guass;

/**
 * @author David Martinez
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		assert arithmeticSum(100)== 5050;
		assert arithmeticSum(10) == 55;
		assert arithmeticSum(2, 100) == 5049;
		assert arithmeticSum(2, 100, 2) == 2550;
		assert arithmeticSum(1, 10, 11) == 1;
		System.out.println(arithmeticSum(Integer.MAX_VALUE));
		System.out.printf("%4.3f seconds%n", (System.currentTimeMillis() - start) / 1000.0d);

	}
	/** n Upper limit (inclusive)*/
	public static long arithmeticSum(int n) {
		return arithmeticSum(1, n);
	}
	/** @param m Lower limit (inclusive)  */
	public static long arithmeticSum(int m, int n) {
		return arithmeticSum(m, n, 1);
	}
	/** @param m Lower limit (inclusive) */
	public static long arithmeticSum(int m, int n, int d) {
		long runningTotal = 0;
		for (long i = m; i <= n; i += d) {
			runningTotal += i;
		}
		return runningTotal;
//		long k = ((long) n - m) / d + 1;
//		return (k *(2 * (long) m + (k - 1) * long) d) / 2;
	}
}
