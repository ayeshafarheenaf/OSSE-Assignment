package com.bits.osse.fileutility.handler;

import java.util.Scanner;

public class InputHandler {

	public static String getConsoleInput() {
		Scanner sc = new Scanner(System.in);
		String input = null;
		try {
			input = sc.next();
			if (input != null) {
				return input;
			} else {
				System.out.println("Invalid input");

			}
		} finally {
			// sc.close();
		}
		return input;
	}
}
