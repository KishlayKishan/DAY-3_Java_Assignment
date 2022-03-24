/*@Purpose::Java Program to print the elements of an array present on odd position.
 *@File::Java Assignment
 *@Author::Kishlay Kishan
 */

package Java_Assignment_Day3;

public class Odd_Array {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Elements of given array present on odd position: ");
		// Loop through the array by incrementing value of i by 2
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}

}
