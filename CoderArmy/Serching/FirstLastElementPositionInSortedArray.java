public class FirstLastElementPositionInSortedArray {
    public static void firstLastPos(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        int mid;
        int firstIndx = -1;
        // to find first index
        while (start<=end) {
                mid = (start + end) / 2;
            if (arr[mid] == key) {
                firstIndx = mid;
                end = mid-1;
            }else if (arr[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        System.out.println("First Index: "+firstIndx);
        // return firstIndx;

        start = 0; end = arr.length-1;
        int lastIndx = -1;
        // to find last index
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                lastIndx = mid;
                start = mid+1;
            }else if (arr[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
       }
       System.out.println("Last index: "+lastIndx);
    //    return lastIndx;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,5,7,8,8};
        int key = 3;
        firstLastPos(arr, key);
    }
}
