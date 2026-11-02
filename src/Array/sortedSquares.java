
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Problem: Squares of a Sorted Array
// Platform: LeetCode
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/

// Approach: Separate positive and negative numbers,
// square them, reverse negative numbers and merge both lists.
// Time Complexity: O(n)
// Space Complexity: O(n)

public class sortedSquares {

    public static void main(String[] args) {

    }

    class Solution {

        public int[] sortedSquares(int[] nums) {

            List<Integer> pos = new ArrayList<>();
            List<Integer> neg = new ArrayList<>();

            // Separate positives and negatives
            for (int ele : nums) {
                if (ele < 0) {
                    neg.add(ele);
                } else {
                    pos.add(ele);
                }
            }

            // Case 1: No positive elements
            if (pos.size() == 0) {
                for (int i = 0; i < neg.size(); i++) {
                    neg.set(i, neg.get(i) * neg.get(i));
                }
                Collections.reverse(neg);
                return neg.stream().mapToInt(Integer::intValue).toArray();
            }

            // Case 2: No negative elements
            if (neg.size() == 0) {
                for (int i = 0; i < pos.size(); i++) {
                    pos.set(i, pos.get(i) * pos.get(i));
                }
                return pos.stream().mapToInt(Integer::intValue).toArray();
            }

            // Case 3: Both positive and negative elements exist
            int n1 = pos.size();
            int n2 = neg.size();
            int[] merge = new int[n1 + n2];

            // Square positive elements
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }

            // Square negative elements and reverse
            for (int j = 0; j < neg.size(); j++) {
                neg.set(j, neg.get(j) * neg.get(j));
            }
            Collections.reverse(neg);

            // Merge two sorted arrays
            int i = 0;
            int j = 0;
            int k = 0;

            while (i < n1 && j < n2) {

                if (neg.get(j) <= pos.get(i)) {
                    merge[k++] = neg.get(j++);
                } else {
                    merge[k++] = pos.get(i++);
                }
            }

            // When positive array is exhausted
            while (j < neg.size()) {
                merge[k++] = neg.get(j++);
            }

            // When negative array is exhausted
            while (i < pos.size()) {
                merge[k++] = pos.get(i++);
            }

            return merge;
        }
    }
}
