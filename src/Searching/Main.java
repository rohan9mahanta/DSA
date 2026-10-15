package Searching;

public class Main {
    public static void main (String[] args){
        int[] arr ={10,12,34,5,6};
        int target = 12;
        boolean result = LinearSearching2(arr,target);
//        System.out.println("Your target is found in index "+ result);
        if (result) {
            System.out.println("Target is found");
        }
        else System.out.println("Not FOund");
    }
    public static int LinearSearching(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearching1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int ele: arr){
            if(ele == target){
                return ele;
            }
        }
        return -1;
    }
    public static boolean LinearSearching2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
