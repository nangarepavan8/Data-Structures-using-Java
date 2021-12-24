package com.sorting;

import java.util.Arrays;

public class SortingMain {

	public static void quickSort(int[] a, int left, int right) {

		
		
		int i = left, j = right, pivot = a[left];
		
		if(left>= right)
			return ;
		
		while (i < j) {
			while (i<= right && a[i] <= pivot)
				i++;
			while (j >=left && a[j] > pivot)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		int temp = a[left];
		a[left] = a[j];
		a[j] = temp;
		
		
		quickSort(a, left, j-1);
		
		quickSort(a, j+1, right);

	}

	public static void main(String[] args) {

		int arr[] = { 6, 3, 9, 1, 7, 2, 8, 4, 5 };

		System.out.println(Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

}
