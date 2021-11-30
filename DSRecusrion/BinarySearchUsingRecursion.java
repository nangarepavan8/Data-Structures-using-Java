package com.sunbeam.DSRecusrion;

import java.util.*;

public class BinarySearchUsingRecursion {

	public static int recursive(int arr[], int key, int left, int right) {
		int index;
		if (left > right) 
			return -1;
		int middle = (left + right) / 2;
		if (key == arr[middle])
				return middle;
		
		if (key < arr[middle])
			
		index = recursive(arr, key, left, middle - 1);
		else
			
		index = recursive(arr, key, middle + 1, right);

		return index;	
		

	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int left = 0;
		int right = arr.length;
//		int middle = (left + right) / 2;

		System.out.println("Enter the key element that you want to find");
		int key = sc.nextInt();

		int index = recursive(arr, key, left, right);

		if (index == -1) {
			System.out.println("element is not in array");
		} else {
			System.out.println("Element present in array at index " + index);
		}
	}

}
