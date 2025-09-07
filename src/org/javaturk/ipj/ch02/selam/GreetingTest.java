package org.javaturk.ipj.ch02.selam;

public class GreetingTest {
    public static void main(String[] args) {
        Greeting selamlama = new Greeting();
        selamlama.greetingWord = "Selam";
        String cevap = selamlama.greet("Zeynep");
        System.out.println(cevap);

        Greeting greeting = new Greeting();
        greeting.greetingWord = "Helloooww";
        String answer = greeting.greet("Tom");
        System.out.println(answer);
    }
}
