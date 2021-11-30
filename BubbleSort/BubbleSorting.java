package com.sunbeam.BubbleSort;

public class BubbleSorting {
// Bubble sort
	public static void BubbleSortArray(int arr[]) {

		for(int i = 0 ; i< arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 99, 45, 98, 65, 22, 78, 38, 49, 81, 13, 11, 18 };

		BubbleSortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
