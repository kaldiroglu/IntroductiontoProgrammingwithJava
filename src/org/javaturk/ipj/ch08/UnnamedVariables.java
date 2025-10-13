package org.javaturk.ipj.ch08;

public class UnnamedVariables {
    // int _ = 5; // Unnamed variable not allowed here

    void main(String[] ___) {
        int _ = 10;
        // System.out.println(_); // Not allowed

        boolean _ = true;
        String _ = "Hi!";
        int _ = 7;

        int[] orderIDs = {34, 45, 23, 27, 15};
        int total = 0;
        for (int ____ : orderIDs) {
            total++;
        }
        System.out.println("Total: " + total);

        String _ = "";
        String _ = "java";
    }
}
