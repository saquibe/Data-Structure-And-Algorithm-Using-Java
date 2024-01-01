//search target in 2D array, which sorted row wise and col wise

public class SearchInSortedRowColWiseMatrix {
    public static boolean searchTarget(int matrix[][], int target){
        int row = matrix.length, col = matrix[0].length;
        int i = 0, j = col-1; //means searching from right conrner of matrix
        while (i<row && j>=0) {
            if (matrix[i][j] == target) {
                return true;
            }else if (matrix[i][j] < target) {
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,8,15,25,60},{18,22,26,42,80},{36,40,45,68,104},{48,50,72,83,130},{70,99,114,128,170}};
        
        int target = 70;
        System.out.println(searchTarget(matrix, target));
    }
}
