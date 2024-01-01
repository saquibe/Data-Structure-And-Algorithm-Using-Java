public class AddTwoMatrix {
    //add two mtrix
    public static void addTwoMatrix(int A[][], int B[][]){
        int sum[][] = new int[3][4];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    //sub two mtrix
    public static void subTwoMatrix(int A[][], int B[][]){
        int sum[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sum[i][j] = A[i][j] - B[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    //mul two matrix
    public static void mulTwoMatrix(int A[][], int B[][]){
        int sum[][] = new int[3][4];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sum[i][j] = A[i][j] * B[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr1[][] = {{2,4,6},{7,6,5},{3,5,6}};
        int arr2[][] = {{12,4,16},{17,6,15},{13,5,16}};

        addTwoMatrix(arr1, arr2);
        subTwoMatrix(arr1, arr2);
        mulTwoMatrix(arr1, arr2);
    }
}
