//divie array with equal sum optimize approach
public class DivideArrayEqualSum {
    public static boolean subArrayEqualSum(int arr[]){
        int n = arr.length;
        int total_sum = 0, prefixSum = 0;;
        for (int i = 0; i < n; i++) {
            total_sum += arr[i];
        }

        for (int i = 0; i < n-1; i++) {
            prefixSum += arr[i];
            if (total_sum == 2*prefixSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,-2,5,8,20,-10,8};

        System.out.println(subArrayEqualSum(arr));
    }
}

//time complexity: O(n)
