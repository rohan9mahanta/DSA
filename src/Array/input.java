package Array;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //1-D Array input
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 1-D Array Outputs methods
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");           // Normal Method
        }

        System.out.print(Arrays.toString(arr));      // Two String Method (best)

        for(int ele: arr){
            System.out.print(ele+" ");               // for each loop method
        }


        // 2-D Array input

        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter cols: ");
        int col = sc.nextInt();
        int [][] arr1 = new int[row][col];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[row].length; j++){   // 2-D array length = row numbers
                arr1 [row][col] = sc.nextInt();
            }
            //2-D array Outputs

          for(int i=0; i<arr1.length; i++){
              for(int j=0; j<arr1[row].length; j++){
                  System.out.print(arr1[row][col]+" ");  // Normal Method
              }
              System.out.println();
          }

           for(int[] ele : arr1){
               System.out.println(arr1+" ");             //for each loop method
           }


            System.out.println(Arrays.toString(arr1));   // Two String method


        }
    }
}
