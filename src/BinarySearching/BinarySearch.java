package BinarySearching;

public class BinarySearch {
public static void main(String[] args) {
    int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
    int target = 0;
    int ans = binarySearch(arr, target);
    if (ans == -1) {
        System.out.println("target not found..");
    } else {
        System.out.println("Target is Found in index: " + ans);
    }
}
// return the index
    // return -1 if doest not exist

    static int binarySearch(int[] arr, int target){
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
    return -1;
    }

}
