
package array;

// Problem: Remove Duplicates from Sorted Array II
// Platform: LeetCode
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/2185827582/

// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicate {

    public static void main(String[] args) {

    }

    class Solution {

        public int removeDuplicates(int[] nums) {

            int i = 0;

            for (int j = 0; j < nums.length; j++) {

                if (i < 2 || nums[j] != nums[i - 2]) {
                    nums[i] = nums[j];
                    i++;
                }
            }

            return i;
        }
    }
}

