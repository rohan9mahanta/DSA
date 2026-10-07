package Array;

public class MaxElementAndMinElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("The maximum element is: "+max(arr));
        System.out.println("The minimum element is: "+min(arr));
    }
    // imagining that the array might be empty
    static int max(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i=0 ;i<arr.length;i++){
           if(max<arr[i]) max =arr[i];
        }
        return max;
    }
    static int min(int[] arr){
        int min =Integer.MAX_VALUE;
        for(int i=0 ;i<arr.length;i++){
            if(min>arr[i]) min =arr[i];
        }
        return min;
    }
}
