package ie.gmit.dip;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The <code>BubbleSort</code> class provides a sorting using Bubble sort algorith.
 */
public class BubbleSort  implements Sortable {

	public void sort(int[] input) {
		boolean isSorted = false; // true if the array is sorted
		for(int i = 1; i < input.length; i++) {
			if(isSorted) break; // break the loop if the array is sorted. It ensures the best case O(n)
			isSorted = true;
			for(int j = 0; j < input.length - i; j++) {
				if(input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					isSorted = false;
				}
			}
		}
	}	
}
