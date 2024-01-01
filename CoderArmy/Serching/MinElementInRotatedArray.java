public class MinElementInRotatedArray {
    public static int minElement(int arr[]){
        int start = 0, end = arr.length-1, mid, ans = arr[0];
        while (start <= end) {
            mid = start+(end-start)/2;
            if (arr[mid] >= arr[0]) {
                start = mid+1;
            }else{
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,8,10,1,2};
        System.out.println(minElement(arr));
    }
}
