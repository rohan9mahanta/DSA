package Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {{1, 7},
                       {2, 4, 3, 17},
                       {19, 45, 77}
        };

        int target = 4;   // changable
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
