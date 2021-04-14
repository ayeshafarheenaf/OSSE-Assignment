package com.bits.osse.fileutility.handler;

import java.util.Scanner;

public class InputHandler {
	
	public static String handleInput(Scanner sc) {
		String input=sc.nextLine();
		if(input!=null) {
			return input;
		}else {
			System.out.println("Invalid input");
			return null;
		}
	}

}
