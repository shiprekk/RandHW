package binarySearch;
import java.util.Random;

import java.util.Arrays;

public class LBSearch {
	
	public static boolean binary(double [] numberArray, double target) {
		 	int first = 0;
	        int last = numberArray.length - 1;
	        int mid = 0;

	        while (first <= last) {
	            	mid = (first + last) / 2;
	            	if (numberArray[mid] < target) {
	            		first = mid + 1;
	            	}
	            	else if (numberArray[mid] > target) {
	            		last = mid - 1;
	            	}
	            	else {
	            		return true;
	            	}
	        }
	        return false;
		 
	}
	
	public static boolean linear(double [] numberArray, double target) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == target) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[]args) {
		
		//array size 10
		double [] numberArray1 = new double[10];
		for (int i = 0; i < numberArray1.length; i++) {
			  numberArray1[i] = (int)(Math.random() * 100001);
		}
		Arrays.sort(numberArray1);
		
		//array size 100
		double [] numberArray2 = new double[100];
		for (int i = 0; i < numberArray2.length; i++) {
			  numberArray2[i] = (int)(Math.random() * 100001);
		}
		Arrays.sort(numberArray2);
		
		//array size 1000
		double [] numberArray3 = new double[1000];
		for (int i = 0; i < numberArray3.length; i++) {
			  numberArray3[i] = (int)(Math.random() * 100001);
		}
		Arrays.sort(numberArray3);
		
		//array size 10000
		double [] numberArray4 = new double[10000];
		for (int i = 0; i < numberArray4.length; i++) {
			  numberArray4[i] = (int)(Math.random() * 100001);
		}
		Arrays.sort(numberArray4);
		
		//array size 100000
		double [] numberArray5 = new double[100000];
		for (int i = 0; i < numberArray5.length; i++) {
			  numberArray5[i] = (int)(Math.random() * 100001);
		}
		Arrays.sort(numberArray5);
		
		
		//Array1 search run
		//target integer created
		System.out.println("N = 10");
		int target = (int)(Math.random() * 100001);
		
		//call linear method
		double t1 = System.nanoTime();
		boolean result1= linear(numberArray1,target);
		double t11 = System.nanoTime();
		
		//linear time
		double duration1= t11 - t1;
		System.out.println("Linear search nanoseconds:");
		System.out.println(duration1);
		System.out.println("Target number found in array:");
		System.out.println(result1);
		
		System.out.println();
		
		
		//call binary method
		double t111 = System.nanoTime();
		boolean result11;
		result11 = binary(numberArray1, target);
		double t1111 = System.nanoTime();
		
		
		//binary time
		double duration11 = t1111 - t111;
		System.out.println("Binary search nanoseconds:");
		System.out.println(duration11);
		System.out.println("Target number found in array:");
		System.out.println(result11);
		System.out.println("----------");
		
		
		
		//Array2 search run
		//target integer created
		System.out.println("N = 100");
		int target2 = (int)(Math.random() * 100001);
		
		//call linear method
		double t2 = System.nanoTime();
		boolean result2= linear(numberArray2,target2);
		double t22 = System.nanoTime();
		
		//linear time
		double duration2= t22 - t2;
		System.out.println("Linear search nanoseconds:");
		System.out.println(duration2);
		System.out.println("Target number found in array:");
		System.out.println(result2);
		
		System.out.println();
		
		
		//call binary method
		double t222 = System.nanoTime();
		boolean result22;
		result22 = binary(numberArray2, target2);
		double t2222 = System.nanoTime();
		
		
		//binary time
		double duration22 = t2222 - t222;
		System.out.println("Binary search nanoseconds:");
		System.out.println(duration22);
		System.out.println("Target number found in array:");
		System.out.println(result22);
		System.out.println("----------");
		
		
		
		//Array3 search run
		//target integer created
		System.out.println("N = 1000");
		int target3 = (int)(Math.random() * 100001);
		
		//call linear method
		double t3 = System.nanoTime();
		boolean result3= linear(numberArray3,target3);
		double t33 = System.nanoTime();
		
		//linear time
		double duration3= t33 - t3;
		System.out.println("Linear search nanoseconds:");
		System.out.println(duration3);
		System.out.println("Target number found in array:");
		System.out.println(result3);
		
		System.out.println();
		
		
		//call binary method
		double t333 = System.nanoTime();
		boolean result33;
		result33 = binary(numberArray3, target3);
		double t3333 = System.nanoTime();
		
		
		//binary time
		double duration33 = t3333 - t333;
		System.out.println("Binary search nanoseconds:");
		System.out.println(duration33);
		System.out.println("Target number found in array:");
		System.out.println(result33);
		System.out.println("----------");
		
		
		
		//Array4 search run
		//target integer created
		System.out.println("N = 10000");
		int target4 = (int)(Math.random() * 100001);
		
		//call linear method
		double t4 = System.nanoTime();
		boolean result4= linear(numberArray4,target4);
		double t44 = System.nanoTime();
		
		//linear time
		double duration4= t44 - t4;
		System.out.println("Linear search nanoseconds:");
		System.out.println(duration4);
		System.out.println("Target number found in array:");
		System.out.println(result4);
		
		System.out.println();
		
		
		//call binary method
		double t444 = System.nanoTime();
		boolean result44;
		result44 = binary(numberArray4, target4);
		double t4444 = System.nanoTime();
		
		
		//binary time
		double duration44 = t4444 - t444;
		System.out.println("Binary search nanoseconds:");
		System.out.println(duration44);
		System.out.println("Target number found in array:");
		System.out.println(result44);
		System.out.println("----------");
		
		
		
		
		//Array5 search run
		//target integer created
		System.out.println("N = 100000");
		int target5 = (int)(Math.random() * 100001);
		
		//call linear method
		double t5 = System.nanoTime();
		boolean result5= linear(numberArray5,target5);
		double t55 = System.nanoTime();
		
		//linear time
		double duration5= t55 - t5;
		System.out.println("Linear search nanoseconds:");
		System.out.println(duration5);
		System.out.println("Target number found in array:");
		System.out.println(result5);
		
		System.out.println();
		
		
		//call binary method
		double t555 = System.nanoTime();
		boolean result55;
		result55 = binary(numberArray5, target5);
		double t5555 = System.nanoTime();
		
		
		//binary time
		double duration55 = t5555 - t555;
		System.out.println("Binary search nanoseconds:");
		System.out.println(duration55);
		System.out.println("Target number found in array:");
		System.out.println(result55);
		System.out.println("----------");
		
		
	
	}

}
