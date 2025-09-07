package org.javaturk.ipj.ch02.selam;

public class HelloTest {

	public static void main(String[] args) {
		Hello object = new Hello();
		String answer = object.sayHello("John");
		System.out.println(answer);

        object = new Hello();
        answer = object.sayHello("Maria");
        System.out.println(answer);
	}
}
