import java.util.Arrays;
import java.util.Scanner;

//Bubble Sort program in Java
public class bubbleSort {

	void bubbleSort(int array[]) {
		// Need double for loop
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {

					// swapping arrays
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		/*
		 * int array[] = new int[5];
		 * for (int i = 0; i < array.length; i++){ array[i] =
		 * (int)(Math.random()*100); }
		 * System.out.println("UnSorted array: " + Arrays.toString(array));
		 * bubbleSort object = new bubbleSort(); object.bubbleSort(array);
		 * System.out.println("Sorted array: " + Arrays.toString(array));
		 */

		// Working on taking sorting taking user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Array Size: ");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter Values: ");
			array[i] = sc.nextInt();
		}

		System.out.println("Unsorted array:   " + Arrays.toString(array));

		// Create new object for bubbleSort
		bubbleSort object = new bubbleSort();
		object.bubbleSort(array);
		// array should now be sorted
		System.out.println("BubbleSort array: " + Arrays.toString(array));

	}

}
