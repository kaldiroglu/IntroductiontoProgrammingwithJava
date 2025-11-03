package org.javaturk.ipj.ch10;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 * This is an example that shows arithmetic promotions made in operators.
 */
public class BreakAndContinueWithLabel {

    public static void main(String[] args) {
        int[][] array = { {32, 87, 3, 589, 7, 912, 617},
                          {12, 1076, 2000, 12, 3},
                          {622, 127, 12, 12}};

		int searchFor = 12;

        boolean foundIt = false;

        here:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchFor) {
                    foundIt = true;
                    System.out.println("Found " + searchFor + " at " + i + ", " + j);
                    break here;
                }
//                System.out.println("Naber abi");
            }
        }

        if (!foundIt)
            System.out.println(searchFor + " not in the array");
    }
}
