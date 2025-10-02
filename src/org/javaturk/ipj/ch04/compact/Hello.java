package org.javaturk.ipj.ch04.compact;

public class Hello{

    String world = "world";

    public String sayHello(String whom) {
        String greeting;
        if (whom != "")
            greeting = "Selam " + whom + " :)";
        else
            greeting = "Selam " + world + " :)";
        return greeting;
    }
}