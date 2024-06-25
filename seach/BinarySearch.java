package seach;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = binarySearch(arr, 5);
        System.out.println(i);
    }
    public static int binarySearch(int [] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if ( arr[mid] > target){
                r = mid - 1;
            }else if (arr[mid] < target){
                l = mid + 1;
            }else {
                return mid;
            }
        }return -1;

    }
}
