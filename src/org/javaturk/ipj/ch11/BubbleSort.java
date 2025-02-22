package org.javaturk.ipj.ch11;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(60);
        print(array);
        sort(array);
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

    public static int[] createArray(int length){
        Random random = new Random();
        int[] array = new int[length];
        for(int i = 0; i < length; i++)
            array[i] = random.nextInt(1_000);
        return array;
    }

    public static void print(int[] array){
        System.out.println("\nPrinting array:");
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
