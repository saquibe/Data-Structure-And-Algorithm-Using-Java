//check if a given array is sorted or not
public class CheckSortedArray {
    public static boolean isSorted(int arr[], int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {0,1,4,2,3,6};
        System.out.println(isSorted(arr, 3));
    }
}
//time complexity--> O(n)
//space complexity--> O(n)