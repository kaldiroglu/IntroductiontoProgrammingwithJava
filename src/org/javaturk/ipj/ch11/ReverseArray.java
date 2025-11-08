package org.javaturk.ipj.ch11;

/**
 * Reverses a given int array.
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverseArray = reverseArray1(array);

        System.out.println("reverse array");
        for (int i : reverseArray)
            System.out.println(i);
    }

    /**
     * Reveres an array using another array.
     *
     * @param array to be reversed.
     * @return Reversed array. d
     */
    static int[] reverseArray1(int[] array) {
        int length = array.length;
        int[] reverseArray = new int[length];
        int cursor = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverseArray[cursor] = array[i];
//            System.out.println("Cursor: " + cursor);
            cursor++;
            //reverseArray[length -1 - i] = array[i];
        }
        return reverseArray;
    }

    /**
     * Reveres an array without using another array.
     *
     * @param array to be reversed.
     * @return Reversed array. d
     */
    static int[] reverseArray2(int[] array) {
        int length = array.length;
        for (int i = length - 1; i >= 0; i--) {
            int value = array[length - 1 - i];
            array[length - 1 - i] = array[i];
            array[i] = value;
        }
        return array;
    }
}
