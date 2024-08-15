package Encapsulation;

import java.util.Date;

public class GarbageEx2 {

	public static void main(String[] args) {
		Runtime r1 = Runtime.getRuntime();
		System.out.println(r1.totalMemory());
		System.out.println(r1.freeMemory());

		for (int i = 1; i <= 100; i++) {
			Date d1 = new Date();
			d1 = null;
		}
		System.out.println(r1.totalMemory());
		System.gc(); // Call to Garbage Collector
		System.out.println(r1.freeMemory());
	}

}
