package com.techno.task;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		GroceryList.menu();
		int num = 1;
		while (num == 1) {
			System.out.println("Enter your input");

			int i = scanner.nextInt();

			num = 0;
			switch (i) {
			case 1:
				GroceryList.add();
				break;
			case 2:
				GroceryList.view();
				break;
			case 3:
				GroceryList.modify();

				break;
			case 4:
				GroceryList.remove();

				break;
			}
			System.out.println("enter 1 to continue");
			GroceryList.menu();
			num = scanner.nextInt();
		}
	}
}