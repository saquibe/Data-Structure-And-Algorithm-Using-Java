import java.util.Scanner;

public class ZeroOnePattern {
    public static void zeroOnePattern(int row, int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rwo and col : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        zeroOnePattern(r, c);
        sc.close();
    }
}
