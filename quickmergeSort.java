package Sorting;

import java.util.Arrays;
import java.util.Random;


public class quickmergeSort {

	public static void quickSort(int [] numberArray, int l, int r) {
		
	 	if (l < r) {
	 		
	 		int p = partition(numberArray, l, r);
	 		
	 		quickSort(numberArray, l, p - 1);
	 		
	 		quickSort(numberArray, p + 1, r);
	 	}
	 
	}
	
	private static int partition(int[] arr, int l, int r) {
		double p = arr[r];
		
		int i = l - 1;
		
		for (int j = l; j < r; j++) {
			if (arr[j] <= p) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i +1];
		arr[i + 1] = arr[r];
		arr[r] = temp;
		
		return i + 1;
	}

	public static void mergeSort(int [] numberArray, int length) {
		if (length < 2) {
			return;
		}
		int mid = length / 2;
		
		int[] l = new int[mid];
		
		int[] r = new int[length - mid];
		
		for (int i = 0; i < mid; i++) {
			l[i] = numberArray[i];
		}
		
		for (int i = mid; i < length; i++) {
			r[i - mid] = numberArray[i];
		}
		
		mergeSort(l, mid);
		mergeSort(r, length - mid);
		merge(numberArray, l, r, mid, length - mid);
		
	}
	
	private static void merge(int[] arr, int[] l, int[] r, int left, int right) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while ( i < left && j < right) {
			if (l[i] <= r[j]) {
				arr[k++] = l[i++];
			}
			else {
				arr[k++] = r[j++];
			}
		}
		
		while (i < left) {
			arr[k++] = l[i++];
		}
		
		while (j < right) {
			arr[k++] = r[j++];
		}
		
	}


	public static void main(String[]args) {
		
		//array size 10
		int [] numberArray1 = new int[10];
		for (int i = 0; i < numberArray1.length; i++) {
			  numberArray1[i] = (int)(Math.random() * 100001);
		}
		
		
		//array size 100
		int [] numberArray2 = new int[100];
		for (int i = 0; i < numberArray2.length; i++) {
			  numberArray2[i] = (int)(Math.random() * 100001);
		}
		
		
		//array size 1000
		int [] numberArray3 = new int[1000];
		for (int i = 0; i < numberArray3.length; i++) {
			  numberArray3[i] = (int)(Math.random() * 100001);
		}
		
		
		//array size 10000
		int [] numberArray4 = new int[10000];
		for (int i = 0; i < numberArray4.length; i++) {
			  numberArray4[i] = (int)(Math.random() * 100001);
		}
		
		
		
				//Array1 sort run
				System.out.println("N = 10");
				
				//call quick method
				int length1 = numberArray1.length;
				double t1 = System.nanoTime();
				 quickSort(numberArray1, 0, length1 - 1);
				double t11 = System.nanoTime();
				
				//quick time
				double duration1= t11 - t1;
				System.out.println("Quick Sort nanoseconds:");
				System.out.println(duration1);
				
				System.out.println();
				
				
				//call merge method
				double t111 = System.nanoTime();
				mergeSort(numberArray1, length1);
				double t1111 = System.nanoTime();
				
				
				//merge time
				double duration11 = t1111 - t111;
				System.out.println("Merge Sort nanoseconds:");
				System.out.println(duration11);
				System.out.println("----------");
		
		
				
				
				
		
				//Array2 sort run
				System.out.println("N = 100");
				
				//call quick method
				int length2 = numberArray2.length;
				double t2 = System.nanoTime();
				 quickSort(numberArray2, 0, length2 -1);
				double t22 = System.nanoTime();
				
				//quick time
				double duration2= t22 - t2;
				System.out.println("Quick Sort nanoseconds:");
				System.out.println(duration2);
				
				System.out.println();
				
				
				//call merge method
				double t222 = System.nanoTime();
				mergeSort(numberArray2, length2);
				double t2222 = System.nanoTime();
				
				
				//merge time
				double duration22 = t2222 - t222;
				System.out.println("Merge Sort nanoseconds:");
				System.out.println(duration22);
				System.out.println("----------");
		
		
				
				
				
				
				//Array3 sort run
				System.out.println("N = 1000");
				
				//call quick method
				int length3 = numberArray3.length;
				double t3 = System.nanoTime();
				 quickSort(numberArray3, 0, length3 - 1);
				double t33 = System.nanoTime();
				
				//quick time
				double duration3= t33 - t3;
				System.out.println("Quick Sort nanoseconds:");
				System.out.println(duration3);
				
				System.out.println();
				
				
				//call merge method
				double t333 = System.nanoTime();
				mergeSort(numberArray3, length3);
				double t3333 = System.nanoTime();
				
				
				//merge time
				double duration33 = t3333 - t333;
				System.out.println("Merge Sort nanoseconds:");
				System.out.println(duration33);
				System.out.println("----------");
				
				
				
				
				
				
				//Array4 sort run
				System.out.println("N = 10000");
				
				//call quick method
				int length4 = numberArray4.length;
				double t4 = System.nanoTime();
				 quickSort(numberArray4, 0, length4 -1);
				double t44 = System.nanoTime();
				
				//quick time
				double duration4= t44 - t4;
				System.out.println("Quick Sort nanoseconds:");
				System.out.println(duration4);
				
				System.out.println();
				
				
				//call merge method
				double t444 = System.nanoTime();
				mergeSort(numberArray4, length4);
				double t4444 = System.nanoTime();
				
				
				//merge time
				double duration44 = t4444 - t444;
				System.out.println("Merge Sort nanoseconds:");
				System.out.println(duration44);
				System.out.println("----------");
	}
	
	
}
