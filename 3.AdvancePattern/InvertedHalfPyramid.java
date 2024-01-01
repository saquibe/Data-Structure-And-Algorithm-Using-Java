import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void halfPyramid(int n){
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int n = sc.nextInt();
        halfPyramid(n);
        sc.close();        
    }
}
