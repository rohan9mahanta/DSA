package BinarySearching;

public class CeilingOfNumber
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = CeilingOfNumber(arr, target);
        if (ans == -1) {
            System.out.println("target not found..");
        } else {
            System.out.println("Target is Found in index: " + ans);
        }
    }
// return the index of smallest number >= target


    static int CeilingOfNumber(int[] arr, int target){
        //when target elemnet is the grratest element so there exists no ceiling
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            // finding the middle element
            // int mid = (start+end)/2 ; might be possible (start+end) may exceed the int range in java..

            int mid = start + (end - start) / 2;

            //if target doest not exists...
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else if(target == arr[mid]){
                return mid;     // answer found..
            }

        }
        return start;
    }

}

