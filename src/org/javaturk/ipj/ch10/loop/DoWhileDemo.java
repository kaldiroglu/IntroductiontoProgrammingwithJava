package org.javaturk.ipj.ch10.loop;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class DoWhileDemo {
    public static void main(String[] args) {
    	
        double r = 0;

        do {	// First comes block
            r = Math.random();
            System.out.println("in do-while: " + r);
        }while(r < 0.8d);	// Then condition
    }
}
