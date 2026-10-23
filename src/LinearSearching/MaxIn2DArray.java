package LinearSearching;

public class MaxIn2DArray {
    public static void main(String[] args){
        int[][] arr = {{1, 7},
                {2, 4, 3, 17},
                {19, 45, 77}
        };

        System.out.println("The maximum element is: " + max(arr));
        System.out.println("The minimum element is: " + min(arr));
    }
    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];

                }
            }
        }
        return max;
    }
    public static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
