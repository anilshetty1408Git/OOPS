package com.practice.oops;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 010110010110 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[j] = arr[i];
					arr[i] = arr[j];
					temp = arr[i];
					System.out.println(temp);
				}
			}
		}

	}
}
