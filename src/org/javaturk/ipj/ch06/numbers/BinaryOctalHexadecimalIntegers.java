package org.javaturk.ipj.ch06.numbers;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class BinaryOctalHexadecimalIntegers {

	public static void main(String[] args) {

		int sayi1 = 0b1010;
		int sayi2 = 0132;
		int sayi3 = 0x5a;
		
		long sayi4 = 0B1111L;
		byte sayi5 = 077;
		short sayi6 = 0XFF;

		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
		System.out.println(sayi4 + " " + sayi5 + " " + sayi6);
		
		int sayi7 = sayi1 + sayi2 + sayi3;
		long sayi8 = sayi4 * sayi5 * sayi6; // Sum is a long number
//		
		System.out.println("sayi7: " + sayi7);
		System.out.println("sayi8: " + sayi8);
//		
		Integer anInt = Integer.decode("0x5A");
		System.out.println(anInt);
	}
}
