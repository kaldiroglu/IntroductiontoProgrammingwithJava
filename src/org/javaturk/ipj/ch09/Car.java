package org.javaturk.ipj.ch09;

/**
 * Bu basit bir araba sınıfı örneğidir.
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class Car {
	 String make;
	 String model;
	 String year;
	 int speed;
	 int distance;
	
	 double go(int newDistance) {
		distance += newDistance;
		double period = (double) newDistance / speed;
		return period;
	}

	 void accelerate(int newSpeed) {
		speed = newSpeed;
	}

	 void stop() {
		speed = 0;
	}

	 String getInfo() {
		String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
		return info;
	}
}
