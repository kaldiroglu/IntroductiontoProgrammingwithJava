package org.javaturk.ipj.ch10.decision.switchCase;

public class SimpleSwitchStatement {
    public static void main(String[] args) {
        long i = 10;
        switch (1L) {
            case 1L:
                System.out.println("i is 1");
                break;
            case 2L:
                System.out.println("i is 2");
                break;
            case 3L:System.out.println("i is 3");
                break;
            default: System.out.println("i is not 1, 2 or 3");
        }
    }
}
