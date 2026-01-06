package org.javaturk.ipj.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
 public class ValuesOfExpressions {

	public static void main(String[] args) {
		int i = 5; // Constant expression
		boolean b = i > 0; // Constant expression
		int j = i + 1; // Constant expression
		String s = "I love" + " " + " Java"; // Constant expression

		int k = increaseOne(i); // Not a constant expression
		System.out.println(k);

		double d = Math.random(); // Not a constant expression
		System.out.println(d);
	}

	public static int increaseOne(int k){
		return k + 1;
	}
}
