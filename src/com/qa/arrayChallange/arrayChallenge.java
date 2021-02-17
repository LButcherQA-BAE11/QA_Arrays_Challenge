package com.qa.arrayChallange;

public class arrayChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = new int[] { 11, 21, 31, 41, 51, 61, 71, 81, 91, 110 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		int value = 1;
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
			System.out.println(arr[i]);
		}

		System.out.println();

		for (int j = 0; j < arr.length; j++) {
			arr[j] *= 10;
			System.out.println(arr[j]);
		}

	}

}
