/*@Purpose::Java Program to print the largest element in an array.
 *@File::Java Assignment
 *@Author::Kishlay Kishan 
 */

package Java_Assignment_Day3;

public class Largest_Array {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		// Initialize max with first element of array.
		int max = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with max
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array: " + max);

	}

}
