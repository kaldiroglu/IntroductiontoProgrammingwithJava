package org.javaturk.ipj.ch04.compact.main;

public class A {

    public String names() {
        B b = new B();
        C c = new C();
        return "A" + b.name() + c.name();
    }
}
