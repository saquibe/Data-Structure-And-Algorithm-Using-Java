import java.util.Scanner;

public class SearchElement {
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                  System.out.println("key at cell ("+i+","+j+")");
                  return true;
                }
            }
        }
        System.out.print("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int key=16;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your matrix data and key : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, key);
        sc.close();
    }
}
