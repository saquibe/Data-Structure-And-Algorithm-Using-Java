//Agressive Cows
//You are given an array consisting of n integers which denote the position of a st1all. You are also given an integer k which denotes the number of aggressive cows. You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
// The first line of input contains two space-separated integers n and k.
// The second line contains n space-separated integers denoting the position of the stalls.
import java.util.Arrays;

public class AggressiveCow {
    public static int solve(int stalls[], int k){
        int start = 1, end, mid, ans = 0;
        int n = stalls.length;
        Arrays.sort(stalls);
        end = stalls[n-1]-stalls[0];

        while (start <= end) {
            mid = start + (end - start) / 2;
            int count = 1, posCow = stalls[0];
            for (int i = 1; i < n; i++) {
                if (posCow+mid < stalls[i]) {
                    count++;
                    posCow = stalls[i];
                }
            }
            if (count < k) {
                end = mid-1;
            }else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int position[] = {1,2,4,8,9};
        int position[] = {10,1,2,7,5};
        int k = 3;

        System.out.println(solve(position, k));
    }
}

//time complexity: O(nlogn)