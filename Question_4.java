package com.Task_11;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		try {
			int div = a / b;
			System.out.println("The answer is: " + div);
		} catch (Exception e) {
			System.out.println("The second number should not be a zero");
			// e.printStackTrace();
		}

	}

}
