package com.sanbeam.Swap;

public class SwapSelectionSort {

	public static void SortArray(int arr[]) {

		int j;

		for (int i = 0; i <= arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
// Asencding sort
				if (arr[i] > arr[j]) {
					
//descending sort   if (arr[i] < arr[j]) 	
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 99, 45, 98, 65, 22, 78, 38, 49, 81, 13, 11, 18 };

		SortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
