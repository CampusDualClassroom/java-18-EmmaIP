package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static int[] createAndInitializeArray(int number) {
		int [] array = new int[number];
		for(int i=0; i <array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length -1) {
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {

		int number = Utils.integer("Write a number: ");
		createAndInitializeArray(number);
		showInlineArray(createAndInitializeArray(number));

	}
}
