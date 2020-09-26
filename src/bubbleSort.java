import java.util.Arrays;

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
	public static void main(String args[]){
		int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}
		
		System.out.println("UnSorted array: " + Arrays.toString(array));

		bubbleSort object = new bubbleSort();
		object.bubbleSort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
