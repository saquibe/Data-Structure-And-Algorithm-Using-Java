//Rotating matrix by 180deg
//step 1: Take transpose of matrix
//step 2: reverse by row
//step 3: again take transpose of matrix
//step 4: again reverse by row
public class RotateMatrix180Deg {
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
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++; end--;
            }
        }

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
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
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
