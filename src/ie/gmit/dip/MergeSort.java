package ie.gmit.dip;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The <code>HeapSort</code> class provides a sorting using Heapsort algorith.
 * <p>
 * Source: Michael Goodrich, Roberto Tamassia, Michael Goldwasser, Data Structures & Algorithms, 2014, page 537 - 538
 */
public class MergeSort implements Sortable {
	
	/**
	 * Sorts the array of integers
	 * 
	 * @param input
	 */
	public void sort(int[] input) {

		if(input.length <= 1) { // The base case - return if the input array has size 1. Such array is sorted
			return; // the base case of recursive algorithm
		}
		// Divide an input array into two halves
		// Find the middle index
		int middleIndex = input.length / 2;
		// Copy the element into left and right part
		int[] left = subarray(input, 0, middleIndex);
		int[] right = subarray(input, middleIndex, input.length);
		
		// Conquer with recursion
		// Call merge sort recursively on both halves (left and right array).
		sort(left); // the INPUT is 'left' array
		sort(right); // the INPUT is 'right' array
		
		// Merge left and right arrays after both recursively called method return sorted arrays
		merge(left, right, input);
	}
	
	/*
	 * Returns the copy of array within the given range.
	 * 
	 * @param input the array from which a range is to be copied
	 * @param start the initial index of the range to be copied, inclusive
	 * @param end the final index of the range to be copied, exclusive.
	 * @return
	 * 
	 */
	private int[] subarray(int[] input, int start, int end) {
		int[] temp = new int[end - start];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = input[start + i];
		}
		return temp;
	}
	
	/*
	 * Merges two arrays into an array. The elements are inserted in an order.
	 * <p>
	 * If there are equal elements in left and right array, the element from the left array is inserted as the first into input array.
	 * 
	 * @param left an array
	 * @param right an array
	 * @param input an array into which the elements from the left and the right array are inserted in an order.
	 */
	private void merge(int[] left, int[] right, int[] input) {
		// Initialize two pointers for the left and right array
		int leftIndex = 0;
		int rightIndex = 0;
		// Loop and insert the elements from the left and right array into input array
		while(leftIndex + rightIndex < input.length) { // the INPUT may be an original array before it was divided into left and right array.
			// Check the conditions. Insert an element from the left array:
			// - if there is no more elements in the right array
			// - if there is an element in the left array && the value of the element from the left array is greater or equal than the value from the right element.
			// Keep a sorting stable. If there are equal elements in left and right array, the element from the left array is inserted as the first into input array.
			if(rightIndex >= right.length || (leftIndex < left.length && left[leftIndex] <= right[rightIndex])) {
				// Copy the element from left array
				input[leftIndex + rightIndex] = left[leftIndex];
				// Increment left index
				leftIndex++;
			}else { // Otherwise insert an element from the right array
				// Copy the element from right array
				input[leftIndex + rightIndex] = right[rightIndex];
				// Increment right index
				rightIndex++;				
			}
		}
	}
}
