//maximum sum in contiguous subArray
public class MaxSumInSubArray {
    public static int maxSum(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int prefixSum = 0;
            for (int j = i; j < arr.length; j++) {
                prefixSum += arr[j];
                maxi = Math.max(maxi, prefixSum);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        // int arr[] = {4,-6,2,8};
        int arr[] = {3,4,-5,8,-12,7,6,-2};

        System.out.println(maxSum(arr));
    }
}

//time complexity: O(n*n)
