// package KunalKuswaha.2-D-Array;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int A[][] = new int[2][3];
        A[0][0] = 4; A[0][1] = 7; A[0][2] = 9; A[1][0] = 14; A[1][1] = 34; A[1][2] = 84;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        int B[][] = {{3,6,8},{7,9,3}};
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        //priting through for each loop
        int C[][] = {{13,16,18},{17,19,23}};
        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }

        //creating jaged array
        int D[][] = new int[3][];
        D[0] = new int[2];
        D[1] = new int[1];
        D[2] = new int[4];

        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                System.out.print(D[i][j]);
            }
            System.out.println();
        }

    }
}
