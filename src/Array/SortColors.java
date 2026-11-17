package Array;

// Problem: Sort Colors
// Platform: LeetCode
// Link: https://leetcode.com/problems/sort-colors/

// Approach: Dutch National Flag Algorithm (Three Pointers)
// Time Complexity: O(n)
// Space Complexity: O(1)

// We use three pointers: low, mid, and high.
// 0s are placed at the beginning, 1s remain in the middle,
// and 2s are placed at the end.

public class SortColors {

    public static void main(String[] args) {

    }

    class Solution {

        public void sortColors(int[] nums) {

            int n = nums.length;

            int low = 0, mid = 0;
            int high = n - 1;

            while (mid <= high) {

                if (nums[mid] == 0) {

                    swap(nums, low, mid);
                    low++;
                    mid++;

                }
                else if (nums[mid] == 1) {

                    mid++;

                }
                else { // nums[mid] == 2

                    swap(nums, mid, high);
                    high--;

                }
            }
        }

        public static void swap(int[] nums, int left, int right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}
