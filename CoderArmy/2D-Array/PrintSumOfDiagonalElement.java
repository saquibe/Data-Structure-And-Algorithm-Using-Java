public class PrintSumOfDiagonalElement {
    public static void diagonalSum(int arr[][]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Diagonal sum: "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{3,5,7},{8,6,5},{4,3,2}};
        diagonalSum(arr);
    }
}
