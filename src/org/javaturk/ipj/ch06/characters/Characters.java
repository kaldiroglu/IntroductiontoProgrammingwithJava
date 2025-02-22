package org.javaturk.ipj.ch06.characters;

public class Characters {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = 'A';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '9';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = ' ';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '₺';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = 'ğ';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u0c2c';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u2690';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u0041';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);

		// Unicode emojis: https://unicode.org/emoji/charts/full-emoji-list.html
		//ch= '\uD83D\uDE03'; // Too many characters
		System.out.println("\uD83D\uDE03"); // Smiling Face with Open Mouth https://www.compart.com/en/unicode/U+1F603

		// ch = '\uD83D\uDE20'; // Too many characters
		System.out.println("\uD83D\uDE20"); // Angry Face https://www.compart.com/en/unicode/U+1F620

		System.out.println("\uD83D\uDE1D");

		// Negative int to char
		ch = (char) -65471; // A
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
	}
}
