//binary search in 2D array best approach
//array must be in sorted form
public class BinarySearch2DArraySecondApproach {
    public static boolean searchMatrix(int[][] matrix, int target) {
        //binary search
        int N = matrix.length, M = matrix[0].length;
        int start = 0, end = N*M-1, mid;
        while(start <= end){
            mid = start+(end-start)/2;
            int row_index = mid/M; //row major
            int col_index = mid%M; //col major
            if(matrix[row_index][col_index]==target){
                return true;
            }else if(matrix[row_index][col_index]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{2,4,6,8,12},{14,16,18,23,124},{126,128,167,198,200},{205,228,230,240,250}};
        int target = 240;

        System.out.println(searchMatrix(arr, target));
    }
}
//time complexity: O(logn*m)
