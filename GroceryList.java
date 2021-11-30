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
		System.out.println("Enter the old item ");
		String old = scanner.next();
		System.out.println("Enter the new item ");
		String str = scanner.next();
		String print = repalce(old, str);
		System.out.println(print);
		System.out.println("**************Modify is Done******************");
		
		
//		System.out.println("enter the item to change");
//		int change =scanner.nextInt();
//		System.out.println("Enter the item number to change");
//		int change1 = scanner.nextInt();
//		if(change<list.size()) {
//		list.set(change+1, list.get(change1+1));
//		}
//		else {
//			System.out.println("Enter the valid index number");
//		}
//		
	}

	

	private static String repalce(String old, String str) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void menu() {

		System.out.println("Enter Your Choices");
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to view");
		System.out.println("Enter 3 to modify");
		System.out.println("Enter 4 to remove");

	}

}
