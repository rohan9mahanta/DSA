package Array;

// Problem: Maximum Sum Subarray of Size K
// Platform: GeeksforGeeks
// Link: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

// Approach: Fixed Size Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

// Calculate the sum of the first k elements.
// Then slide the window by removing the outgoing element
// and adding the incoming element.

public class MaxSubarraySum {

    public static void main(String[] args) {

    }

    class Solution {

        public int maxSubarraySum(int[] arr, int k) {

            // Example: arr = [100, 200, 300, 400]
            int n = arr.length;

            int low = 0, high = k - 1;
            int sum = 0;

            // Calculate the sum of the first window
            for (int i = 0; i < k; i++) {
                sum = sum + arr[i];
            }

            int max_sum = sum;

            while (high < n - 1) {

                sum = sum - arr[low];

                // Slide the window
                low++;
                high++;

                sum = sum + arr[high];

                max_sum = Math.max(max_sum, sum);
            }

            return max_sum;
        }
    }
}