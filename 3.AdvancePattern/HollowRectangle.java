import java.util.Scanner;

public class HollowRectangle{
    public static void holloRect(int row, int col){
        //outer loop
        for (int i = 1; i <= row; i++) {
            //inner-colums
            for (int j = 1; j <= col; j++) {
                //cells (i,j)
                if (i==1 || i==row || j==1 || j==col) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column number : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        holloRect(row, col);
        sc.close();
    }
}