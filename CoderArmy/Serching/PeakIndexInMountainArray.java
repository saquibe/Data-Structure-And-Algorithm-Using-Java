//peak index in mountain array
public class PeakIndexInMountainArray {
    public static int peakIndx(int arr[]){
        int start = 0, end = arr.length, mid;
        while (start <= end) {
            mid = (start+end)/2;
            if ((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])) {
                return mid;
            }else if (arr[mid] > arr[mid-1]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        //if peak index not found 
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,8,5};
        System.out.println(peakIndx(arr));
    }
}


//time complexity: O(logn)