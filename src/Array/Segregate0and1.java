package Array;
// Problem: Segregate 0s and 1s
// Platform: GeeksforGeeks
// Link: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

// Approach: Count zeros and overwrite the array.
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Segregate0and1 {

        public static void main(String[] args) {
        }

        class Solution {
            void segregate0and1(int[] arr) {

                int count = 0;
                // "count" counts the number of 0s present.
                for(int ele: arr){       // and the remaining elements are 1s...
                    if(ele==0){
                        count++;
                    }
                }

                for(int i=0; i<arr.length; i++){

                    if(i < count) {
                        arr[i] = 0;
                    }
                    else {            // i > count
                        arr[i] = 1;
                    }
                }
            }
        }

    }

