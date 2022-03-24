/*@Purpose::Java Program to print the elements of an array in reverse order.
 *@File::Java Assignment
 *@Author::Kishlay Kishan
 */

package Java_Assignment_Day3;

public class Reverse_Array {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		// Loop through the array in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
