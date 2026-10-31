
package array;

// Problem: Two Sum II - Input Array Is Sorted
// Platform: LeetCode
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

// Approach: Two Pointers (Left and Right)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class TwoSum2 {

    public static void main(String[] args) {

    }

    class Solution {

        public int[] twoSum(int[] numbers, int target) {

            int i = 0;
            int j = numbers.length - 1;

            while (i < j) {

                int sum = numbers[i] + numbers[j];

                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                }
                else if (sum > target) {
                    j--;
                }
                else if (sum < target) {
                    i++;
                }
            }

            return numbers;
        }
    }
}
