package ie.gmit.dip;

import java.util.Arrays;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The <code>BenchmarkSortAlgorithm</code> class provides a method to run a benchmark of sorting algorithm.
 */
public class BenchmarkSortAlgorithm {
	private double[] times;
	private double avg;
	private long start;
	private long stop;
	
	/**
	 * Returns the average running time
	 * 
	 * @return the average running time
	 */
	public double getAvg() {
		return this.avg;
	}

	/**
	 * Sets up the average time of running a sorting algorithm.
	 * 
	 * @param s Sortable
	 * @param array input of integer array
	 * @param iterations number of iterations
	 */
	public void runBenchmark(Sortable s, int[] array, int iterations) {
		times = new double[iterations];
		for(int i = 0; i < times.length; i++) {
			// Create a copy of an array
			int[] arrayCopy = Arrays.copyOf(array, array.length);
			// Sort an array copy and measure a time
			start = System.nanoTime();
			s.sort(arrayCopy);
			stop = System.nanoTime();
			double timeElapsedMillis = (stop - start)/1000000.0;
			times[i] = timeElapsedMillis;
		}
		setAvg(times);
	}
	
	private void setAvg(double[] times) {
		this.avg = Arrays.stream(times).average().getAsDouble();
	}
}
