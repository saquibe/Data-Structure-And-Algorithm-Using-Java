// package CoderArmy.Serching;
//for binary search array must be sorted

public class BinarySearcy {
    public static int bSearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
                int mid = (start+end)/2;
            if (arr[mid] == key ) {
                System.out.println("Found at index: ");
                return mid;
            }else if (arr[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        System.out.println("Key is not found: ");
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,10,13,15,20};
        int key = 8;
        System.out.println(bSearch(arr, key));
    }
}

//time complexity
//worst case: O(logn)
//best case: O(1)
