package com.problems.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/3sum/description/
 * 
 * Optimum solution so far given below has Time complexity of O(N^2).
 * 
 * To find triplets: pick a single element then scan through the array to find 
 * a pair of elements whose sum is counter value of the picked element.
 * To avoid duplicates:Firstly, For sum scanning set range from (i+1) to array.length-1,where
 * (i) is the index of the picked element. 
 * Secondly, skip the element picked if its value is equal to its previous element 
 * i.e array[i] == array[i-1]
 * Thirdly, skip the element when scanning if its value is equal to the element before 
 * it. Remember this condition should be skipped if the previous element is the single
 *  picked element.
 */

public class ThreeSum {

	// O(N^2)
	public static List<List<Integer>> find(int[] nums) {
		Arrays.sort(nums); // O(NlogN)
		List<List<Integer>> qualifyingSetList = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) { // O(N)
			if (i >= 1 && nums[i] == nums[i - 1]) {
				continue;
			}
			int reqSum = 0 - nums[i];
			int leftPointer = i + 1;
			int rightPointer = nums.length - 1;
			while (leftPointer < rightPointer) {// O(N)
				if (leftPointer - 1 > i && nums[leftPointer] == nums[leftPointer - 1]) {
					leftPointer++;
					continue;
				}
				if (rightPointer + 1 < nums.length && nums[rightPointer] == nums[rightPointer + 1]) {
					rightPointer--;
					continue;
				}
				if (nums[leftPointer] + nums[rightPointer] == reqSum) {
					List<Integer> newList = new ArrayList<>();
					newList.add(nums[leftPointer]);
					newList.add(nums[rightPointer]);
					newList.add(nums[i]);
					qualifyingSetList.add(newList);
					leftPointer++;
				} else if (nums[leftPointer] + nums[rightPointer] > reqSum) {
					rightPointer--;
				} else {
					leftPointer++;
				}
			}
		}
		return qualifyingSetList;
	}

	public static void printSets(List<List<Integer>> qualifyingSets) {
		for (List<Integer> selectedSet : qualifyingSets) {
			System.out.println(selectedSet);
		}
	}

}
