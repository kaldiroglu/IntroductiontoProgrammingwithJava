package org.javaturk.ipj.ch11;

import java.util.Random;

/**
 * https://en.wikipedia.org/wiki/Bubble_sort
 * https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
 * @author akin
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(60);
//        int[] array = {5, 1, 4, 2, 8};

        System.out.println("Array before sorting:");
        print(array);
        System.out.println();

//            sort(array);
        sortVisually(array);

        System.out.println("\nArray after sorting:");
        print(array);
    }

    public static void sort(int[] array){
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortVisually(int[] array){
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            System.out.println("\nPass number: " + i);
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
//                    System.out.println("Starting with " + array[j]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("Swapping " + array[j] + " and " + array[j + 1]);
                    print(array);
                }
            }
            System.out.println("After the pass number: " + i);
            print(array);
        }
    }

    public static int[] createArray(int length){
        Random random = new Random();
        int[] array = new int[length];
        for(int i = 0; i < length; i++)
            array[i] = random.nextInt(1_000);
        return array;
    }

    public static void print(int[] array){
//        System.out.println("\nPrinting array:");
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
