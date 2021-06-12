package org.pupu;

public class Phone {

	public static void main(String[] args) {

		String a = "8248586171";

		int b = a.length();
		System.out.println("Num Length Is :" + b);

		if (b <= 10 && b > 9) {

			System.out.println("Mbl Num is valid");
	

		} else {
			System.out.println("Mbl num was Exceed 10");
			System.out.println("Mbl num is Invalid");
		}

	}

}
