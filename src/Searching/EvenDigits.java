package Searching;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args){
     int[] nums = {12,422,1,2,44,-7777};
        System.out.println( "Number of even digits: " + findNumbers(nums));
    }
    public static int findNumbers(int[] nums){
        int numOfDigits = 0;
        for(int i=0;i<nums.length;i++) {
            int Digit = count(nums[i]);
            if (Digit % 2 == 0) {
                numOfDigits++;
            }
        }
        return numOfDigits;
    }
    public static int count(int num){
        if(num==0){
            num = 1;
        }
        if(num<0){
            num = num*-1;     // checkpoint for negative numbers
        }
        int count = 0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

}
