// Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n. 
// Examples: 
// Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
// Output: Pair Found: (2, 80)
// Input: arr[] = {90, 70, 20, 80, 50}, n = 45
// Output: No Such Pair

import java.util.Arrays;

public class PairWithGivenDifference{
    public static boolean pairWidthdiff(int arr[], int target){
        //sovlve suing two pointer approach
        int start = 0, end = 1, n = arr.length;
        Arrays.sort(arr);
        while (start < n) {
            if (arr[end]-arr[start] == target) {
                return true;
            }else if (arr[end]-arr[start] < target) {
                end++;
            }else{
                start++;
                if (start==end) {
                    end++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 50, 80}, n = 78;
        //    int arr[] = {90, 70, 20, 80, 50}, n = 45;

           System.out.println(pairWidthdiff(arr, n));
    }
}