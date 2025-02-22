package org.javaturk.ipj.ch03;

public class WeirdComments{
	
	// /** That has no effect! */
	
	public static void main(String[] args) {
		int /* */ i = 5;
		boolean b = /** */ true;
		int k /** */ = i/** */++;	
		System.out.println(i + " " + b + " " + k);
	}
}
