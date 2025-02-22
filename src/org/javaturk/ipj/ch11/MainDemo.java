package org.javaturk.ipj.ch11;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class MainDemo {

	public static void main(String[] args) {

		if (args.length == 3) {
			String name = args[0];
			String lastName = args[1];
			String age = args[2];
			System.out.println("You've provided: " + name + " " + lastName + " " + age);
		} else {
			System.out.println("Please provide three arguments!");
			System.exit(1);
		}

		int length = args.length;
		System.out.println(length + " tane arguman gectin.");

		for (String s : args)
			System.out.println(s);

		// Parse age to get int value
		int intAge = Integer.parseInt(args[2]);
		int yearOfBirth = 2023 - intAge;
		System.out.println(yearOfBirth + " yılında doğdun.");
	}
}
