package com.problems.leetcode.threesum;

public class Main {

	public static void main(String[] args) {

		// Edge Case 4
		int[] nums4 = { -1, 0, 1, 2, -1, -4 };
		// Desired Output
		/*
		 * [[-1,-1,2],[-1,0,1]]
		 */
		System.out.println("--- Edge Case 4 ----");
		ThreeSum.printSets(ThreeSum.find(nums4));
		System.out.println("--- End ----");

		// Edge Case 1
		int[] nums1 = { -10, 5, 10, 0, 8, 1, -4, -4, -5, -3 };
		// Desired Output
		/*
		 * {-10, 0, 10} {-5, 0, 5} {-5, -3, 8} {-4, -4, 8}
		 */

		System.out.println("--- Edge Case 1 ----");
		ThreeSum.printSets(ThreeSum.find(nums1));
		System.out.println("--- End ----");

		// Edge Case 2
		int[] nums2 = { -4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6 };
		// Desired Output
		/*
		 * [[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
		 */
		System.out.println("--- Edge Case 2 ----");
		ThreeSum.printSets(ThreeSum.find(nums2));
		System.out.println("--- End ----");

		// Edge Case 3
		int[] nums3 = { -4, -2, 0, 2, 0, 4, 0 };
		// Desired Output
		/*
		 * [[-4,0,4],[-2,0,2],[0,0,0]]
		 */
		System.out.println("--- Edge Case 3 ----");
		ThreeSum.printSets(ThreeSum.find(nums3));
		System.out.println("--- End ----");

	}

}
