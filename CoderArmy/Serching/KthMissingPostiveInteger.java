public class KthMissingPostiveInteger {
    public static int kthPosInte(int arr[], int k){
        int start = 0, end = arr.length-1, mid, ans = arr.length;
        while (start<=end) {
            mid = start+(end-start)/2;
            if (arr[mid]-mid-1 >= k) {
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans+k;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,8,9};
        int target = 6;

        System.out.println(kthPosInte(arr, target));
    }
}

//time complexity: O(logn)