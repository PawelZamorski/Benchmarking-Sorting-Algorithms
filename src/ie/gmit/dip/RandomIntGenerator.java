package ie.gmit.dip;

import java.util.Random;

/**
 * @author  Pawel Zamorski
 * @version 1.0
 * @since 1.8
 * 
 * The RandomIntGenerator class is used to generate random Integer arrays.
 */
public class RandomIntGenerator {
	
	/**
	 * Returns an array of pseudorandom, uniformly distributed Integers. A value of an Integer is between 0 (inclusive) and the size of array (inclusive).
	 * All bound possible Integer values are produced with (approximately) equal probability. 
	 * @param size int as the size of array. Must be equal or greater than 0.
	 * @return an array of pseudorandom Integers between 0 (inclusive) and the size of array (inclusive).
	 * @throws NegativeArraySizeException if size is negative
	 */
	public static int[] randomIntArr(int size) {
		Random r = new Random();
		int[] randomArray = new int[size];
		for(int i = 0; i < size; i++) {
			randomArray[i] = r.nextInt(size + 1);
		}
		return randomArray;
	}
}
