package com.bits.osse.fileutility.handler;

import java.util.Scanner;

public class InputHandler {

	public static String getConsoleInput() {
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			if (input != null) {
				return input;
			} else {
				System.out.println("Invalid input");
				return null;
			}
		} finally {
			sc.close();
		}
	}
}
