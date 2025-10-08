package org.javaturk.ipj.ch11;

public class StringReverse {

    void main(String[] args) {

        int numberOfArguments = args.length;
        if (numberOfArguments != 1) {
            System.out.println("Please provide only one argument!");
            return;
        } else {
            String string = args[0];
            int length = string.length();
            char[] array = new char[length];
            for (int i = 0; i < length; i++) {
                array[length - 1 - i] = string.charAt(i);
            }
            System.out.println("Provided string: " + string);
            System.out.println("Reverse string: " + new String(array));
        }
    }
}
