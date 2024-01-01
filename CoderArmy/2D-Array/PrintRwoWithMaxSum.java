//print row index with max sum
public class PrintRwoWithMaxSum {
    public static void rowWithMaxSum(int arr[][]){
        int maxSum = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            
            if (maxSum < total) {
                maxSum = total;
                index = i;
            }
        }
        System.out.println("Row no is: "+index);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,1,3},{1,2,4,1},{1,5,4,1},{4,5,6,7}};

        rowWithMaxSum(arr);
    }
}
