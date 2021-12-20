package day12;

import java.util.Arrays;

class MaxHeap {
	private int[] arr;
	private int size;

	public MaxHeap(int[] a) {
		arr = a;
		size = a.length - 1;
	}

	public void makeHeap() {
		size = arr.length - 1;
		for (int i = size / 2; i >= 1; i--) {
			int temp = arr[i], ci = i * 2;
			while (ci <= size) {
				if ((ci + 1) <= size && arr[ci + 1] > arr[ci])
					ci = ci + 1;
				if (temp > arr[ci])
					break;
				arr[ci / 2] = arr[ci];
				ci = ci * 2;
			}
			arr[ci / 2] = temp;
		}
	}
	public void print() {
		System.out.println("Heap:");
		for(int i=1; i<arr.length; i++)
			System.out.println(arr[i]+ "'");
		System.out.println();
	}
	public int delMax() {
		int max=arr[1];
		int temp=arr[size];
		size=size-1;
		int ci=2;
		while (ci <= size) {
			if ((ci + 1) <= size && arr[ci + 1] > arr[ci])
				ci = ci + 1;
			if (temp > arr[ci])
				break;
			arr[ci / 2] = arr[ci];
			ci = ci * 2;
		}
		arr[ci / 2] = temp;
	
		return max;
	}
}

public class HeapSortMain {
	public static int KthHighestElement(int[] arr, int k) {
		MaxHeap h= new MaxHeap(arr);
		h.makeHeap();
		int max=0;
		for(int i=1; i<=k; i++)
			max=h.delMax();
		return max;
	}
	public static void heapSort(int[] arr) {
		MaxHeap h= new MaxHeap(arr);
		h.makeHeap();
		for(int i=1; i<arr.length;i++) {
			int max=h.delMax();
		arr[arr.length-i]=max;
		}
	}
	public static void main(String[] args) {
		int[] arr = { 0, 20, 12, 35, 15, 10, 80, 30, 17, 2, 1 };
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		/*
		 * MaxHeap h = new MaxHeap(arr); h.print(); h.makeHeap(); h.print(); int
		 * val=h.delMax(); System.out.println("deleted node"+ val); h.print();
		 */
	}

}
