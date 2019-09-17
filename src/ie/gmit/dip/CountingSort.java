package ie.gmit.dip;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The <code>CountingSort</code> class provides a sorting using Counting sort algorithm.
 * <p>
 * Source: https://www.geeksforgeeks.org/counting-sort/
 */
public class CountingSort implements Sortable {

	/**
	 * Sorts the integer array.
	 * Counting sort that enables to count efficiently an integer array where the min value is different than 0.
	 * It enables to sort negative numbers.
	 * <p>
	 * The count array must starts from the index 0. 
	 * To keep this condition for min values different than 0, correct the value from the input array when operating on the count array.
	 * The value is subtracted by min value.
	 * @param input input array of integers
	 */
	public void sort(int[] input) {
		// Find the min and max element in order to determine a range of the values in an input array
		// that is needed to set up a correct size of a count array
		// initialize both values with the value at index 0
		int min = input[0];
		int max = input[0];
		for(int i = 0; i < input.length; i++) {
			if(min > input[i]) min = input[i];
			if(max < input[i]) max = input[i];
		}
		// Initialize the count array with the size: max - min + 1
		int[] count = new int[max - min + 1];
		// Initialize the output array
		int[] output = new int[input.length];
		// Loop over the input array and create a histogram using the count array
		for(int i = 0; i < input.length; i++) {
			// increment the value at a appropriate index of count array. The correct index is pointed by the value in the input index.
			// Subtract value from input array by min when dealing with count array
			count[input[i] - min]++;
		}
		// Modify the count array by using prefix sum computation: C[i] = C[i] + C[i – 1]. The value at index 0 stays the same.
		for(int i = 1; i < count.length; i ++) {
			count[i] = count[i] + count[i - 1];
		}
		// Loop over the input array and populate the output array in the sorted order.
		// Keep it stable by starting from the last element of the input array.
		for(int i = input.length - 1; i >= 0; i--) {
			// The correct index for element in index i is equal to the value at the appropriate index of count array - 1
			// Subtract value from input array by min when dealing with count array
			output[count[input[i] - min] - 1] = input[i];
			// Decrement the value in the current index of count array.
			// It will point the correct index in the output array.
			// Subtract value from input array by min when dealing with count array
			count[input[i] - min]--;
		}
		// Copy the values from the output array to the input array.
		for(int i = 0; i < input.length; i++) {
			input[i] = output[i];
		}
		// The array is is sorted		
	}
}
