package ie.gmit.dip;

import java.text.DecimalFormat;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The Runner class is used to run, test and display the running times of sorting algorithms.
 */
public class Runner {

	public static void main(String[] args) {
		DecimalFormat myFormatter = new DecimalFormat("###.####");

		// Generate arrays of random integers
		// An array of size 10 of random Integers between 0 and 10
		int[] random10 = RandomIntGenerator.randomIntArr(10);
		// An array of size 100 of random Integers between 0 and 100
		int[] random100 = RandomIntGenerator.randomIntArr(100);
		// An array of size 250 of random Integers between 0 and 250
		int[] random250 = RandomIntGenerator.randomIntArr(250);
		// An array of size 500 of random Integers between 0 and 500
		int[] random500 = RandomIntGenerator.randomIntArr(500);
		// An array of size 750 of random Integers between 0 and 750
		int[] random750 = RandomIntGenerator.randomIntArr(750);
		// An array of size 1000 of random Integers between 0 and 1000
		int[] random1000 = RandomIntGenerator.randomIntArr(1000);
		// An array of size 2500 of random Integers between 0 and 2500
		int[] random2500 = RandomIntGenerator.randomIntArr(2500);
		// An array of size 5000 of random Integers between 0 and 5000
		int[] random5000 = RandomIntGenerator.randomIntArr(5000);
		// An array of size 7500 of random Integers between 0 and 7500
		int[] random7500 = RandomIntGenerator.randomIntArr(7500);
		// An array of size 10000 of random Integers between 0 and 10000
		int[] random10000 = RandomIntGenerator.randomIntArr(10000);
		// An array of size 15000 of random Integers between 0 and 15000
		int[] random15000 = RandomIntGenerator.randomIntArr(15000);
		// An array of size 20000 of random Integers between 0 and 20000
		int[] random20000 = RandomIntGenerator.randomIntArr(20000);
		// An array of size 25000 of random Integers between 0 and 25000
		int[] random25000 = RandomIntGenerator.randomIntArr(25000);
		// An array of size 30000 of random Integers between 0 and 30000
		int[] random30000 = RandomIntGenerator.randomIntArr(30000);
		
		// Test algorithm
		BenchmarkSortAlgorithm benchmark = new BenchmarkSortAlgorithm();
		
		// BUBBLE SORT
		Sortable bubbleSort = new BubbleSort();
		// input size 10
		benchmark.runBenchmark(bubbleSort, random10, 10);
		String bubbleSAvg10 = myFormatter.format(benchmark.getAvg());
		// input size 100
		benchmark.runBenchmark(bubbleSort, random100, 10);
		String bubbleSAvg100 = myFormatter.format(benchmark.getAvg());
		// input size 250
		benchmark.runBenchmark(bubbleSort, random250, 10);
		String bubbleSAvg250 = myFormatter.format(benchmark.getAvg());
		// input size 500
		benchmark.runBenchmark(bubbleSort, random500, 10);
		String bubbleSAvg500 = myFormatter.format(benchmark.getAvg());
		// input size 750
		benchmark.runBenchmark(bubbleSort, random750, 10);
		String bubbleSAvg750 = myFormatter.format(benchmark.getAvg());
		// input size 1000
		benchmark.runBenchmark(bubbleSort, random1000, 10);
		String bubbleSAvg1000 = myFormatter.format(benchmark.getAvg());
		// input size 2500
		benchmark.runBenchmark(bubbleSort, random2500, 10);
		String bubbleSAvg2500 = myFormatter.format(benchmark.getAvg());
		// input size 5000
		benchmark.runBenchmark(bubbleSort, random5000, 10);
		String bubbleSAvg5000 = myFormatter.format(benchmark.getAvg());
		// input size 7500
		benchmark.runBenchmark(bubbleSort, random7500, 10);
		String bubbleSAvg7500 = myFormatter.format(benchmark.getAvg());
		// input size 10000
		benchmark.runBenchmark(bubbleSort, random10000, 10);
		String bubbleSAvg10000 = myFormatter.format(benchmark.getAvg());
		// input size 15000
		benchmark.runBenchmark(bubbleSort, random15000, 10);
		String bubbleSAvg15000 = myFormatter.format(benchmark.getAvg());
		// input size 20000
		benchmark.runBenchmark(bubbleSort, random20000, 10);
		String bubbleSAvg20000 = myFormatter.format(benchmark.getAvg());
		// input size 25000
		benchmark.runBenchmark(bubbleSort, random25000, 10);
		String bubbleSAvg25000 = myFormatter.format(benchmark.getAvg());
		// input size 30000
		benchmark.runBenchmark(bubbleSort, random30000, 10);
		String bubbleSAvg30000 = myFormatter.format(benchmark.getAvg());

		// HEAPSORT SORT
		Sortable heapSort = new HeapSort();
		// input size 10
		benchmark.runBenchmark(heapSort, random10, 10);
		String heapAvg10 = myFormatter.format(benchmark.getAvg());
		// input size 100
		benchmark.runBenchmark(heapSort, random100, 10);
		String heapAvg100 = myFormatter.format(benchmark.getAvg());
		// input size 250
		benchmark.runBenchmark(heapSort, random250, 10);
		String heapAvg250 = myFormatter.format(benchmark.getAvg());
		// input size 500
		benchmark.runBenchmark(heapSort, random500, 10);
		String heapAvg500 = myFormatter.format(benchmark.getAvg());
		// input size 750
		benchmark.runBenchmark(heapSort, random750, 10);
		String heapAvg750 = myFormatter.format(benchmark.getAvg());
		// input size 1000
		benchmark.runBenchmark(heapSort, random1000, 10);
		String heapAvg1000 = myFormatter.format(benchmark.getAvg());
		// input size 2500
		benchmark.runBenchmark(heapSort, random2500, 10);
		String heapAvg2500 = myFormatter.format(benchmark.getAvg());
		// input size 5000
		benchmark.runBenchmark(heapSort, random5000, 10);
		String heapAvg5000 = myFormatter.format(benchmark.getAvg());
		// input size 7500
		benchmark.runBenchmark(heapSort, random7500, 10);
		String heapAvg7500 = myFormatter.format(benchmark.getAvg());
		// input size 10000
		benchmark.runBenchmark(heapSort, random10000, 10);
		String heapAvg10000 = myFormatter.format(benchmark.getAvg());
		// input size 15000
		benchmark.runBenchmark(heapSort, random15000, 10);
		String heapAvg15000 = myFormatter.format(benchmark.getAvg());
		// input size 20000
		benchmark.runBenchmark(heapSort, random20000, 10);
		String heapAvg20000 = myFormatter.format(benchmark.getAvg());
		// input size 25000
		benchmark.runBenchmark(heapSort, random25000, 10);
		String heapAvg25000 = myFormatter.format(benchmark.getAvg());
		// input size 30000
		benchmark.runBenchmark(heapSort, random30000, 10);
		String heapAvg30000 = myFormatter.format(benchmark.getAvg());

		// COUNTING SORT
		Sortable countingSort = new CountingSort();
		// input size 10
		benchmark.runBenchmark(countingSort, random10, 10);
		String countingAvg10 = myFormatter.format(benchmark.getAvg());
		// input size 100
		benchmark.runBenchmark(countingSort, random100, 10);
		String countingAvg100 = myFormatter.format(benchmark.getAvg());
		// input size 250
		benchmark.runBenchmark(countingSort, random250, 10);
		String countingAvg250 = myFormatter.format(benchmark.getAvg());
		// input size 500
		benchmark.runBenchmark(countingSort, random500, 10);
		String countingAvg500 = myFormatter.format(benchmark.getAvg());
		// input size 750
		benchmark.runBenchmark(countingSort, random750, 10);
		String countingAvg750 = myFormatter.format(benchmark.getAvg());
		// input size 1000
		benchmark.runBenchmark(countingSort, random1000, 10);
		String countingAvg1000 = myFormatter.format(benchmark.getAvg());
		// input size 2500
		benchmark.runBenchmark(countingSort, random2500, 10);
		String countingAvg2500 = myFormatter.format(benchmark.getAvg());
		// input size 5000
		benchmark.runBenchmark(countingSort, random5000, 10);
		String countingAvg5000 = myFormatter.format(benchmark.getAvg());
		// input size 7500
		benchmark.runBenchmark(countingSort, random7500, 10);
		String countingAvg7500 = myFormatter.format(benchmark.getAvg());
		// input size 10000
		benchmark.runBenchmark(countingSort, random10000, 10);
		String countingAvg10000 = myFormatter.format(benchmark.getAvg());
		// input size 15000
		benchmark.runBenchmark(countingSort, random15000, 10);
		String countingAvg15000 = myFormatter.format(benchmark.getAvg());
		// input size 20000
		benchmark.runBenchmark(countingSort, random20000, 10);
		String countingAvg20000 = myFormatter.format(benchmark.getAvg());
		// input size 25000
		benchmark.runBenchmark(countingSort, random25000, 10);
		String countingAvg25000 = myFormatter.format(benchmark.getAvg());
		// input size 30000
		benchmark.runBenchmark(countingSort, random30000, 10);
		String countingAvg30000 = myFormatter.format(benchmark.getAvg());

		// MERGE SORT
		Sortable mergeSort = new MergeSort();
		// input size 10
		benchmark.runBenchmark(mergeSort, random10, 10);
		String mergeAvg10 = myFormatter.format(benchmark.getAvg());
		// input size 100
		benchmark.runBenchmark(mergeSort, random100, 10);
		String mergeAvg100 = myFormatter.format(benchmark.getAvg());
		// input size 250
		benchmark.runBenchmark(mergeSort, random250, 10);
		String mergeAvg250 = myFormatter.format(benchmark.getAvg());
		// input size 500
		benchmark.runBenchmark(mergeSort, random500, 10);
		String mergeAvg500 = myFormatter.format(benchmark.getAvg());
		// input size 750
		benchmark.runBenchmark(mergeSort, random750, 10);
		String mergeAvg750 = myFormatter.format(benchmark.getAvg());
		// input size 1000
		benchmark.runBenchmark(mergeSort, random1000, 10);
		String mergeAvg1000 = myFormatter.format(benchmark.getAvg());
		// input size 2500
		benchmark.runBenchmark(mergeSort, random2500, 10);
		String mergeAvg2500 = myFormatter.format(benchmark.getAvg());
		// input size 5000
		benchmark.runBenchmark(mergeSort, random5000, 10);
		String mergeAvg5000 = myFormatter.format(benchmark.getAvg());
		// input size 7500
		benchmark.runBenchmark(mergeSort, random7500, 10);
		String mergeAvg7500 = myFormatter.format(benchmark.getAvg());
		// input size 10000
		benchmark.runBenchmark(mergeSort, random10000, 10);
		String mergeAvg10000 = myFormatter.format(benchmark.getAvg());
		// input size 15000
		benchmark.runBenchmark(mergeSort, random15000, 10);
		String mergeAvg15000 = myFormatter.format(benchmark.getAvg());
		// input size 20000
		benchmark.runBenchmark(mergeSort, random20000, 10);
		String mergeAvg20000 = myFormatter.format(benchmark.getAvg());
		// input size 25000
		benchmark.runBenchmark(mergeSort, random25000, 10);
		String mergeAvg25000 = myFormatter.format(benchmark.getAvg());
		// input size 30000
		benchmark.runBenchmark(mergeSort, random30000, 10);
		String mergeAvg30000 = myFormatter.format(benchmark.getAvg());

		// QUICK SORT
		Sortable quickSort = new QuickSort();
		// input size 10
		benchmark.runBenchmark(quickSort, random10, 10);
		String qsAvg10 = myFormatter.format(benchmark.getAvg());
		// input size 100
		benchmark.runBenchmark(quickSort, random100, 10);
		String qsAvg100 = myFormatter.format(benchmark.getAvg());
		// input size 250
		benchmark.runBenchmark(quickSort, random250, 10);
		String qsAvg250 = myFormatter.format(benchmark.getAvg());
		// input size 500
		benchmark.runBenchmark(quickSort, random500, 10);
		String qsAvg500 = myFormatter.format(benchmark.getAvg());
		// input size 750
		benchmark.runBenchmark(quickSort, random750, 10);
		String qsAvg750 = myFormatter.format(benchmark.getAvg());
		// input size 1000
		benchmark.runBenchmark(quickSort, random1000, 10);
		String qsAvg1000 = myFormatter.format(benchmark.getAvg());
		// input size 2500
		benchmark.runBenchmark(quickSort, random2500, 10);
		String qsAvg2500 = myFormatter.format(benchmark.getAvg());
		// input size 5000
		benchmark.runBenchmark(quickSort, random5000, 10);
		String qsAvg5000 = myFormatter.format(benchmark.getAvg());
		// input size 7500
		benchmark.runBenchmark(quickSort, random7500, 10);
		String qsAvg7500 = myFormatter.format(benchmark.getAvg());
		// input size 10000
		benchmark.runBenchmark(quickSort, random10000, 10);
		String qsAvg10000 = myFormatter.format(benchmark.getAvg());
		// input size 15000
		benchmark.runBenchmark(quickSort, random15000, 10);
		String qsAvg15000 = myFormatter.format(benchmark.getAvg());
		// input size 20000
		benchmark.runBenchmark(quickSort, random20000, 10);
		String qsAvg20000 = myFormatter.format(benchmark.getAvg());
		// input size 25000
		benchmark.runBenchmark(quickSort, random25000, 10);
		String qsAvg25000 = myFormatter.format(benchmark.getAvg());
		// input size 30000
		benchmark.runBenchmark(quickSort, random30000, 10);
		String qsAvg30000 = myFormatter.format(benchmark.getAvg());

		System.out.printf("%1$-18s %2$-10s %3$-10s %4$-10s %5$-10s %6$-10s %7$-10s %8$-10s %9$-10s %10$-10s %11$-10s %12$-10s %13$-10s %14$-10s %15$-10s", "Input size", "10", "100", "250", "500", "750", "1000", "2500", "5000", "7500", "10000", "15000", "20000", "25000", "30000");
    	System.out.println();
    	System.out.printf("%1$-18s %2$-10s %3$-10s %4$-10s %5$-10s %6$-10s %7$-10s %8$-10s %9$-10s %10$-10s %11$-10s %12$-10s %13$-10s %14$-10s %15$-10s", "Bubble Sort", bubbleSAvg10, bubbleSAvg100, bubbleSAvg250, bubbleSAvg500, bubbleSAvg750, bubbleSAvg1000, bubbleSAvg2500, bubbleSAvg5000, bubbleSAvg7500, bubbleSAvg10000, bubbleSAvg15000, bubbleSAvg20000, bubbleSAvg25000, bubbleSAvg30000);
    	System.out.println();
    	System.out.printf("%1$-18s %2$-10s %3$-10s %4$-10s %5$-10s %6$-10s %7$-10s %8$-10s %9$-10s %10$-10s %11$-10s %12$-10s %13$-10s %14$-10s %15$-10s", "Heap Sort", heapAvg10, heapAvg100, heapAvg250, heapAvg500, heapAvg750, heapAvg1000, heapAvg2500, heapAvg5000, heapAvg7500, heapAvg10000, heapAvg15000, heapAvg20000, heapAvg25000, heapAvg30000);
    	System.out.println();
    	System.out.printf("%1$-18s %2$-10s %3$-10s %4$-10s %5$-10s %6$-10s %7$-10s %8$-10s %9$-10s %10$-10s %11$-10s %12$-10s %13$-10s %14$-10s %15$-10s", "Counting Sort", countingAvg10, countingAvg100, countingAvg250, countingAvg500, countingAvg750, countingAvg1000, countingAvg2500, countingAvg5000, countingAvg7500, countingAvg10000, countingAvg15000, countingAvg20000, countingAvg25000, countingAvg30000);
    	System.out.println();
    	System.out.printf("%1$-18s %2$-10s %3$-10s %4$-10s %5$-10s %6$-10s %7$-10s %8$-10s %9$-10s %10$-10s %11$-10s %12$-10s %13$-10s %14$-10s %15$-10s", "Merge Sort", mergeAvg10, mergeAvg100, mergeAvg250, mergeAvg500, mergeAvg750, mergeAvg1000, mergeAvg2500, mergeAvg5000, mergeAvg7500, mergeAvg10000, mergeAvg15000, mergeAvg20000, mergeAvg25000, mergeAvg30000);
    	System.out.println();
    	System.out.printf("%1$-18s %2$-10s %3$-10s %4$-10s %5$-10s %6$-10s %7$-10s %8$-10s %9$-10s %10$-10s %11$-10s %12$-10s %13$-10s %14$-10s %15$-10s", "Quick Sort", qsAvg10, qsAvg100, qsAvg250, qsAvg500, qsAvg750, qsAvg1000, qsAvg2500, qsAvg5000, qsAvg7500, qsAvg10000, qsAvg15000, qsAvg20000, qsAvg25000, qsAvg30000);	
	}
}
