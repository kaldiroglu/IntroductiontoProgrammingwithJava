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
//		int k = 2_147_483_648; // Max limit of an int number in Java is 2_147_483_647
		int k = 2_147_483_647 + 1; // Max limit of an int number in Java is 2_147_483_647
//		int k = 2_147_483_647; // Max limit of an int number in Java
        System.out.println(k);
		int i = k + 1; // -2147483648
		System.out.println(i);

		int j = increaseOne(k);
	}

	public static int increaseOne(int k){
		return k + 1;
	}
}
