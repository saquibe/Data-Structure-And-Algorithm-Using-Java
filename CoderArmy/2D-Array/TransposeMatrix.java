public class TransposeMatrix{
    public static void tPose(int a[][]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    public static void print(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{11,12,13,14},{15,16,17,18},{19,10,20,21},{22,23,24,25}};

        // print(matrix);
        tPose(matrix);
        print(matrix);
    }
}

//time complexity: O(N*N)
//space complexity: O(1)