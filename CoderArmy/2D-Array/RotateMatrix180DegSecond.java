//Note: rotate matrix by K time-> 1-time=90deg, 2-time=180deg, 3->time=270(anti-clock 90deg)
//4->time=0deg if given k time take mod of k (e.g: he ask 7 time 90deg rotation then simply 7%2 rotate 1time by 90deg)

//Rotate matrix by 180deg 
//step 1: reverse matrix by column
//step 2: reverse matrix by row
public class RotateMatrix180DegSecond {
    public static void rotateMat(int matrix[][]){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while (start < end) {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++; end--;
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

        System.out.println("Before Rotating");
        printt(matrix);
        System.out.println("After Rotating");
        rotateMat(matrix);
        printt(matrix);
    }
}
//time complexity: O(N*N)
//space complexity: O(1)