public class SpiralMatrix{
    public static void spiralMat(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {
            //topBoundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //rightBoundary
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottomBoundary
            for (int j = endCol-1; j >= startCol+1; j--) {
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //leftBoundary
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol==endCol) {
                    break;
                }
                System.out.print(matrix[endCol][i]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMat(matrix);
    }
}