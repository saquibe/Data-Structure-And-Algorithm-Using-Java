//largest sum contiguous subarray using kadanes algorithm
public class LargestSumContiguousSubArrayKadanesAlgo {
    public static int kadanesAlgo(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            maxi = Math.max(maxi, prefixSum);
            if (prefixSum < 0) {
                prefixSum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,-5,8,-12,7,6,-2};

        System.out.println(kadanesAlgo(arr));
    }
}

//time complexity: O(n)
