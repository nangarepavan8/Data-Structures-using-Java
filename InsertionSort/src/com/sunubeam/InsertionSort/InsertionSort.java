package com.sunubeam.InsertionSort;

public class InsertionSort {

	public static void insertionSort(int arr[])
	{
		int i,j,temp;
		
		for(i=1; i< arr.length; i++)
		{
			temp=arr[i];
			for(j =  i-1 ; j>=0 && arr[j] > temp ; j-- )
			{
				arr[j+1] = arr[j];
					
			}
			arr[j+1] = temp;
		}	
	}
	public static void main(String[] args) {


		int arr [] = {45,54, 88,99,11,13,18,21,27,49,72};
		
		insertionSort(arr);
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			System.out.print(arr[i] +" ,");
		}
		

	}

}
