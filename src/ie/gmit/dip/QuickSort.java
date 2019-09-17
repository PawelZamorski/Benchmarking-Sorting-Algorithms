package ie.gmit.dip;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The <code>QuickSort</code> class provides a sorting using Quicksort algorith.
 * <p>
 * Source: Michael Goodrich, Roberto Tamassia, Michael Goldwasser, Data Structures & Algorithms, 2014, page 553
 */

public class QuickSort implements Sortable {
	
	/**
	 * Sorts the array of integers.
	 * It is in-place quicksort.
	 * 
	 * @param input a collection to be sorted
	 */
	public void sort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}
	
	/*
	 * In-place quicksort
	 * 
	 * @param input a collection to be sorted
	 * @param begin a leftmost index
	 * @param end an rightmost index
	 */
	private void quickSort(int[] input, int begin, int end) {
		// Sort until there are elements in a collection
		if(begin >= end) return; // Return if there is one element in array
		// Select the pivot. This algorithm always selects the last element as the pivot.
		int pivot = input[end];
		// Initialize left-side pointer and right-side pointer needed for in-place swapping operation
		int left = begin;
		int right = end - 1;
		int temp; // temp used for swapping
		// Run until both pointers meet together
		while(left <= right) {
			// run loop until it finds greater element than pivot
			while(left <= right && input[left] < pivot) {
				left++; // increment left
			}

			while(left <= right && input[right] > pivot) {
				right--; // decrement right
			}
			// Swap founded elements on the left and right and shrink range
			if (left <= right) {
				temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;
			}
		}
		// Place pivot into its final index, which is marked by left or right
		temp = input[left];
		input[left] = pivot; // pivot = input[end]
		input[end] = temp;
		// Make recursive calls
		quickSort(input, begin, left - 1);
		quickSort(input, left + 1, end);		
	}
}
