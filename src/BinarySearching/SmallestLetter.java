package BinarySearching;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter
{
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            // finding the middle element
            // int mid = (start+end)/2 ; might be possible (start+end) may exceed the int range in java..

            int mid = start + (end - start) / 2;

            //if target doest not exists...
            if (target < letters[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return letters[start % letters.length];


    }




