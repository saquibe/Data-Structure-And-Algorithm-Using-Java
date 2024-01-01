public class BinarySearch2DArrays {
    public static boolean bSearch(int arr[][], int x){
        int N = arr.length, M = arr[0].length;
        for (int i = 0; i < N; i++) {
            if ((arr[i][0] <= x) && (x <= arr[i][M-1])) {
                //binary search
                int start = 0, end = M-1, mid;
                while (start < end) {
                    mid = start+(end-start)/2;
                    if (arr[i][mid] == x) {
                        return true;
                    }else if (arr[i][mid] < x) {
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
            }  
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{2,11,10,14,18},{20,24,27,29,35},{47,52,78,93,97},{108,111,201,207,215}};
        int X = 207;

        System.out.println(bSearch(arr, X));
    }
}
//time complexity: O(NlogM)