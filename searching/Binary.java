package com.sunbeam.searching;
import java.util.*;
public class Binary {

	public static int binarySearch(int arr[], int key)
	{
		int middle;
		int left=0;
		int right=arr.length-1;
		
		while(left <= right)
		{
			middle = (left + right)/2;
			
			if(key == arr[middle])
				return middle;
			else if(key< arr[middle])
			{
			   	right = middle - 1;
			}
			else
			{
				left = middle + 1;
			}		
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		
		System.out.println("enter the element : ");
		
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		
		if(index == -1)
		{
			System.out.println("index not found ");
		}
		else
		{
			System.out.println("value found present "+ index);
		}

	}

}
