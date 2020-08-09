package com.arrays;

public class Algo {

	public static void main(String[] args) {

		char[] array1 = { 'a', 'b', 'c', 'i' };
		char[] array2 = { 'z', 'y', 'i' };

		/** ============================================================================
		 *   Worst Case => This is not recommended & not a efficient (or) optimised code
		 *   O(n * m) Time Complexity & O(1) Space Complexity
		 *   where, 
		 *   	n => 1st i/p (array1)
		 *   	m => 2nd i/p (array2)
		 * ============================================================================
		 */
		boolean result = Algo.constainsCommonItem(array1, array2);

		// Result
		System.out.println("\nResult is '" + result + "'");

	}

	// Given 2 arrays, create a function that
	// let's a user know (true / false) whether
	// these two arrays contain any common items
	// -----------------------------------------
	//  1. Example:
	//	      array1 = ["a", "b", "c", "x"];
	//	      array2 = ["z", "y", "i"];
	//	      return false
	// -----------------------------------------
	//  2. Example:
	//	      array1 = ["a", "b", "c", "x"];
	//	      array2 = ["z", "y", "x"];
	//	      return true

	// INPUT  -> 2 parameters - arrays - no size limit
	// OUTPUT -> return true or false
	private static boolean constainsCommonItem(char[] arr1, char[] arr2) {

		// validate
		if (arr1.length == 0 || arr2.length == 0) {
			System.out.println(" Invalid i/p passed");
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Outer loop " + arr1[i]);
			for (int j = 0; j < arr2.length; j++) {
				System.out.println("	Inner loop " + arr2[j]);
				if (arr1[i] == arr2[j]) {
					System.out.println("	== Element Found == ");
					return true;
				}

			}
		}
		return false;

	}

}
