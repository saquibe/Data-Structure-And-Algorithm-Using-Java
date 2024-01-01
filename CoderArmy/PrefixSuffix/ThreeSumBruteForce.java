public class ThreeSumBruteForce {
    public static boolean isThreeSum(int arr[], int X){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    if (arr[i]+arr[j]+arr[j2] == X) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
        int S = 13;

        System.out.println(isThreeSum(arr, S));
    }
}

//time complexity: O(n*n*n)