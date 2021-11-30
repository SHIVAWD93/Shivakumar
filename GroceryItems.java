package com.technohyb.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItems {
	int numOfItems = 1;
	static Scanner sc = new Scanner(System.in);
	static ArrayList array = new ArrayList();
	static Grocerycart gc = new Grocerycart();
	public static void main(String[] args) {
		int num = 1;
		while (num == 1) {
			num = 0;
			System.out.println("Enter 1 for Add Items ");
			System.out.println("Enter 2 for veiw Items");
			System.out.println("Enter 3 for Remove Items");
			System.out.println("Enter 4 for Modify Items");
			int as = sc.nextInt();
			switch (as) {
			case 1:
				addItem();
				break;
			case 2:
				viewItem();
				break;
			case 3:
				removeItem();
				break;
			case 4:
				modify();
				break;
			default:
				System.out.println("Entered Invalid Number");
			}
			System.out.println("Press 1 For Main Menu");
			num = sc.nextInt();
		}

	}

	public static void removeItem() {
		System.out.println("Enter The Index To Remove");
		int index = sc.nextInt();
		array.remove(index);

	}

	public static void addItem() {
		int num = 1;
		while (num == 1) {
			num = 0;
			System.out.println("Item Which Are Available ");
			System.out.println("For Clothes click  On 1");
			System.out.println("For Food  click On 2");
			System.out.println("For Electronics click On 3");
			int i = sc.nextInt();
			System.out.println("Enter number of items ");
			int numberOfItem = sc.nextInt();
			Object obj = gc.clothes(numberOfItem);
			Object obj1 = gc.food(numberOfItem);
			Object obj2 = gc.electronics(numberOfItem);

			switch (i) {
			case 1:
				int count = 0;
				for (int j = 0; j < numberOfItem; j++) {
					array.add(obj);
					count++;
				}
				System.out.println("Item is Added " + count + " times");
				break;
			case 2:
				int count1 = 0;
				for (int j = 0; j < numberOfItem; j++) {
					array.add(obj1);
					count1++;
				}
				System.out.println("Item is added " + count1 + " times");
				break;
			case 3:
				int count2 = 0;
				for (int j = 0; j < numberOfItem; j++) {
					array.add(obj2);
					count2++;
				}
				System.out.println("Item is added " + count2 + " times");
				break;
			default:
				System.out.println("Enter a valid number");
			}

			System.out.println("Press 1 To Add More Items Or 0 To Exit ");
			num = sc.nextInt();
		}

	}

	public static void viewItem() {

		for (int j = 0; j < array.size(); j++) {
			System.out.println(array.get(j));
		}
	}

	public static void modify() {
		System.out.println("Enter The Index Number To Replace");
		int index = sc.nextInt();
		System.out.println("Enter The 2nd Index Number ");
        int index1=sc.nextInt();
		array.set(index, array.get(index1));
	}

}
