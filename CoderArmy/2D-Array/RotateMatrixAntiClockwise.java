//Rotate matrix or image anti clockwise by 90deg
//step 1: take transpose of matrix
//step 2: reverse by column
public class RotateMatrixAntiClockwise {
    public static void rotateImageAntiClock(int matrix[][]){
        int n = matrix.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while (start < end) {
                //swap
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++; end--;
            }
        }
    }

    //print function to print matrix
    public static void print(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before Rotating");
        print(matrix);
        System.out.println("After rotating");
        rotateImageAntiClock(matrix);
        print(matrix);
    }
}

//time complexity: O(N*N)
//space complexity: O(1)
