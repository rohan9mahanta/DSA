package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem: 3Sum
// Platform: LeetCode
// Link: https://leetcode.com/problems/3sum/

// Approach: Sorting + Two Pointers
// Time Complexity: O(n²)
// Space Complexity: O(n) - for storing the result

public class ThreeSum {

    public static void main(String[] args) {
    }

    class Solution {

        public List<List<Integer>> threeSum(int[] nums) {

            Arrays.sort(nums);

            int n = nums.length;

            List<List<Integer>> result = new ArrayList();

            // Example after sorting:
            // nums = {-4, -1, -1, 0, 1, 2}

            for (int i = 0; i < n - 2; i++) {

                // Skip duplicate values of i
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = n - 1;

                while (left < right) {

                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {

                        result.add(
                                Arrays.asList(nums[i], nums[left], nums[right])
                        );

                        left++;
                        right--;

                        // Skip duplicates of left
                        while (left < n &&
                                nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicates of right
                        while (right >= 0 &&
                                nums[right] == nums[right + 1]) {
                            right--;
                        }

                    }
                    else if (sum < 0) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }

            return result;
        }
    }
}