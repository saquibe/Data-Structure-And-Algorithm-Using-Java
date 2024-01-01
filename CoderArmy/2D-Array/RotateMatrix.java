//Rotate matrix by 90deg clockwise direction
public class RotateMatrix {
    //brute force
    public static void rotateMat(int arr[][]){
    //     int row = arr.length, col = arr.length;
    //     int ans[][] = new int[row][col];

    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < col; j++) {
    //             ans[j][row-1-i] = arr[i][j];
    //         }
    //     }
    //     //time complexity: O(N*N)
    //     //space complexity: O(N*N)
    // }



    //Optimize approach
    //1: take transpose of matrix
    //2: reverse rwo element

    //time complexity: O(N*N)
    //space complexity: O(1)

    int n = arr.length;
    //transpose of matrix
    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j < n; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    //reverse rwo
    for (int i = 0; i < n; i++) {
        int start = 0, end = n-1;
        while (start < end) {
            int swapEle = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = swapEle;
            start++; end--;
            }
        }
    }

    // //function to print array
    public static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};

        rotateMat(arr);
        print(arr);
    }
}