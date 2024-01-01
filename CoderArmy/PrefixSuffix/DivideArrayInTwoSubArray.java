//divide array in two sub array with equal sum
//bruteforce approach
public class DivideArrayInTwoSubArray {
    public static boolean solution(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int sum1 = 0, sum2 = 0; 

            for (int j = 0; j <= i; j++) {
                sum1 += arr[j];
            }
            for (int j = i+1; j < n; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) {
                System.out.println("sum is : "+sum1);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,-2,5,8,20,-10,8};

        System.out.println(solution(arr));
    }
}

//time complexity: O(n*n)