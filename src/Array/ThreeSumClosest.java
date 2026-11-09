package Array;

import java.util.Arrays;

// Problem: 3Sum Closest
// Platform: LeetCode
// Link: https://leetcode.com/problems/3sum-closest/

// Approach: Sorting + Two Pointers
// Time Complexity: O(n²)
// Space Complexity: O(1) auxiliary space

public class ThreeSumClosest {

    public static void main(String[] args) {
    }

    class Solution {

        public int threeSumClosest(int[] nums, int target) {

            // Example: nums = [-1, 2, 1, -4]
            Arrays.sort(nums);
            // After sorting: [-4, -1, 1, 2]

            int n = nums.length;

            int max_diff = Integer.MAX_VALUE;
            int result_sum = 0;

            for (int i = 0; i < n - 2; i++) {

                int left = i + 1;
                int right = n - 1;

                while (left < right) {

                    int sum = nums[i] + nums[left] + nums[right];

                    int diff = Math.abs(sum - target);

                    // Update the closest sum
                    if (diff < max_diff) {
                        max_diff = diff;
                        result_sum = sum;
                    }

                    // Exact match found
                    if (sum == target) {
                        return sum;
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }

            return result_sum;
        }
    }
}