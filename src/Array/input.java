package Array;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        //1-D Array input
//        System.out.print("Enter array size: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print(Arrays.toString(arr));      // Two String Method (best)
//
//        for(int ele: arr){
//            System.out.print(ele+" ");               // for each loop method
//        }
//
//        // 1-D Array Outputs methods
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");           // Normal Method
//        }

        // 2-D Array input

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter cols: ");
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];

// 1. Input for 2D array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

// 2. Normal nested for loop
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

// 3. Enhanced for-each loop
        for (int[] ele : arr1) {
            System.out.println(Arrays.toString(ele));
        }

// 4. Arrays.toString alternative for 2D arrays
        System.out.println(Arrays.deepToString(arr1));

        }
    }


