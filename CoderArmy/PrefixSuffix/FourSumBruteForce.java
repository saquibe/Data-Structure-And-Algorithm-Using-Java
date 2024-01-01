public class FourSumBruteForce {
    public static boolean isFourSum(int arr[], int X){
        for (int i = 0; i < arr.length-3; i++) {
            for (int j = 0; j < arr.length-2; j++) {
                for (int j2 = 0; j2 < arr.length-1; j2++) {
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[i]+arr[j]+arr[j2]+arr[k] == X) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,1,0,6,0};
        int S = 7;
        
        System.out.println(isFourSum(arr, S));
    }
}

//time complexity: O(N*N*N*N)