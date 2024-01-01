// package CoderArmy.2D-Array;

public class Basic {
    public static void printArr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,6,8},{3,8,7},{5,7,9},{3,1,3}};
        
        printArr(arr);
    }
}