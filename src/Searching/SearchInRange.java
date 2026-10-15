package Searching;


public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10, 12, 34, 5, 6};
        int result = LinearSearching(arr, 12, 1, 4);
        System.out.println("your target is found index : " + result);
    }

    public static int LinearSearching(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}