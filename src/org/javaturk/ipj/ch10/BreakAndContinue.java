package org.javaturk.ipj.ch10;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class BreakAndContinue {
	public static void main(String args[]) {
		
		System.out.println("break\n");
		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0)
				break ; // Terminate loop.
			System.out.println(i + ":   " + Math.sqrt(i));
		}
		
		System.out.println("\ncontinue\n");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0)
				continue; // Terminate only this step.
			System.out.println(i + ":   " + Math.sqrt(i));
		} // end of for loop
	} 
}
