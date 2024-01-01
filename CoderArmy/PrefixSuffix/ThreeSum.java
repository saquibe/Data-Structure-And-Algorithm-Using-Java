//Given an array arr of size n and integer X find if theres a triplet in the array which sum upto the given Integer X

import java.util.Arrays;

public class ThreeSum {
    public static boolean threeSum(int A[], int X){
        int n = A.length;
        Arrays.sort(A);

        for (int i = 0; i < n-2; i++) {
            int ans = X-A[i];

            int start = i+1, end = n-1;
            while (start < end) {
                if (A[start]+A[end] == ans) {
                    return true;
                }else if (A[start]+A[end] > ans) {
                    end--;
                }else{
                    start++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = {1,4,45,6,10,8};
        int X = 13;

        System.out.println(threeSum(A, X));
    }
}

//time complexity: O(n*n)