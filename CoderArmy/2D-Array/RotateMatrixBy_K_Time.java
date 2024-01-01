//rotaitn matrix k-times write 90deg rotation function take mod of k by 2

import java.util.Scanner;

public class RotateMatrixBy_K_Time {
    public static void rotate_90_Deg(int matrix[][]){
        int n = matrix.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++; end--;
            }
        }
    }

    public static void printt(int matrix[][]){
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
        System.out.println("How many times you want to rotate: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        k = k%4;
        while (k>0) {
            System.out.println("Before Rotating");
            printt(matrix);
            System.out.println("After Rotating");
            rotate_90_Deg(matrix);
            printt(matrix);
        }
    }
}
