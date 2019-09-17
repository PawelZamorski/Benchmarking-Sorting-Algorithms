package ie.gmit.dip;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The <code>HeapSort</code> class provides a sorting using Heapsort algorith.
 * <p>
 * Source: https://www.geeksforgeeks.org/heap-sort/
 */
public class HeapSort implements Sortable {
	
	/**
	 * Sorts array of integers.
	 * 
	 * @param input an array
	 */
	public void sort(int[] input) {
		// A size of input array
		int size = input.length;

		// Build heap (rearrange array)
		for (int i = (size / 2) - 1; i >= 0; i--) { // Start from the last bottom parent that has a child (it may have only left child): index = (size / 2 ) - 1
			// Call heapify method iteratively up the heap. Heapify method goes down if there was any element effected.
			heapify(input, size, i);
		}
		
		// Sort elements
		// Iteratively swap the element from the top of the heap with the element from the left side of the array, going up the array.
		for (int i = size-1; i>=0; i--) {
			int temp = input[0];
			input[0] = input[i];
			input[i] = temp;
			
			// Call max heapify on the reduced heap to rebuild the heap 
			heapify(input, i, 0); // Initialize heapify method with a root index (parent = 0). On every iteration the size of array is shorter.
		}
	} 
	  
	 /*
	  * Builds a heap (a complete binary heap) using a down-heap bubbling.
	  * The element from the root is moved down of the tree until the tree is in the correct order.
	  * 
	  * @param input an array
	  * @param heapSize size of heap
	  * @param parent index in array
	  */
	 private void heapify(int[] input, int heapSize, int parent) {
		int largestItemIdx = parent;  // Initialize largestItemInx as parent
		int leftChildIdx = 2 * parent + 1;  // left child index at array (2 * i + 1)
		int rightChildIdx = 2 * parent + 2;  // right child index at array (2 * i + 2)
		
		// At first check if left child is less than size of array.
		// If left child item is larger than largest item, assign left child index to the largestItemIdx
		if (leftChildIdx < heapSize && input[leftChildIdx] > input[largestItemIdx]) largestItemIdx = leftChildIdx;
		
		// At first check if right child is less than size of array.
		// If right child item is larger than largest item, assign right child index to the largestItemIdx
		if (rightChildIdx < heapSize && input[rightChildIdx] > input[largestItemIdx]) largestItemIdx = rightChildIdx;
		
		// Swap the element if parent element was not the largesItem (moves element down the heap)
		if (largestItemIdx != parent) { // The base case. If the parent element is greater than child elements, the method returns.
			int temp = input[parent];
			input[parent] = input[largestItemIdx];
			input[largestItemIdx] = temp;
			
			// Recursively heapify the affected sub-tree (check if the parent item is larger than left and right child)
			heapify(input, heapSize, largestItemIdx); // heapify method goes down the heap
		}
	}
}
