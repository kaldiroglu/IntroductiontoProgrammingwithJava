
/*
 * We see here 2 enhancements that came with JDK 25:
 * - No need to declare a class for valid Java code, a main method is enough
 * - No need to declare main methods as public static void main(String[] args),
 *   now it is much more succint: void main()
 */

import org.javaturk.ipj.ch04.compact.Selam;
import org.javaturk.ipj.ch04.compact.Hello;

Random random = new Random();

String start = "*** Greeting Example ***";

 public void main() {
	System.out.println(start);
	saySalam();
    sayHello();
}

void saySalam(){
	Selam s = new Selam();
	int limit = random.nextInt(10);
	for(int i = 0; i < limit; i++)
			System.out.println(s.selamSoyle("Nalan"));

}

void sayHello(){
    Hello h = new Hello();
    int limit = random.nextInt(10);
    for(int i = 0; i < limit; i++)
        System.out.println(h.sayHello("Jane"));
}

/*
class Selam{
	
	String world = "millet";
	
	public String selamSoyle(String kime) {
		String cumle;
		if (kime != "")
			cumle = "Selam " + kime + " :)";
		else
			cumle = "Selam " + world + " :)";
		return cumle;
  }
}*/

 

