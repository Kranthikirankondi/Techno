package com.techno.task;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList list = new ArrayList();

	// ****************************************************************************************************
	public static void add() {
		// System.out.println("Enter the Product Name");
		System.out.println("Enter the size");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(scanner.next());
		}
		System.out.println("************Adding is Done*****************");
	}

	// *****************************************************************************************************
	public static void view() {

		System.out.println(list);
		System.out.println("************View is Done*****************");

	}

	// ******************************************************************************************************
	public static void remove() {
		System.out.println("Enter the value to be remove");
		String str = scanner.next();
		list.remove(str);
		System.out.println(list);
		System.out.println("**************Remove is Done******************");
	}

	// *********************************************************************************************************
	public static void modify() {

  System.out.println("enter the old item");
	int change =scanner.nextInt();
	System.out.println("Enter the new item ");
	int change1 = scanner.nextInt();
	if(change1!=change) {
		list.remove(change1);
		list.add(change1);
		}
	System.out.println(list);
	
	System.out.println("**************Modify is Done******************");
	}

//**********************************************************************************
	public static void menu() {

		System.out.println("Enter Your Choices");
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to view");
		System.out.println("Enter 3 to modify");
		System.out.println("Enter 4 to remove");

	}

}
