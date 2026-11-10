package Array;

import java.util.Arrays;

// Problem: Count Triplets with Sum Smaller than a Given Value
// Platform: GeeksforGeeks
// Link: https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-a-given-value/1

// Approach: Sorting + Two Pointers
// Time Complexity: O(n²)
// Space Complexity: O(1) auxiliary space

public class CountTriplets {

    public static void main(String[] args) {
    }

    class Solution {

        int countTriplets(int sum, int arr[]) {

            // Sort the array first
            Arrays.sort(arr);
            // Example: arr = [1, 3, 4, 5, 7], sum = 12

            int n = arr.length;
            int count = 0; // Counts valid triplets

            for (int i = 0; i < n - 2; i++) {

                int left = i + 1;
                int right = n - 1;

                while (left < right) {

                    int s = arr[i] + arr[left] + arr[right];

                    if (s >= sum) {
                        right--;
                    }
                    else { // s < sum

                        // All elements between left and right
                        // form valid triplets with i and left
                        count = count + (right - left);

                        left++;
                    }
                }
            }

            return count;
        }
    }
}