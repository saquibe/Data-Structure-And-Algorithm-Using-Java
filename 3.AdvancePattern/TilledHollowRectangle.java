import java.util.Scanner;

public class TilledHollowRectangle {
    public static void tilleRectangle(int n){
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //for tilled rectangle
            for (int j = 1; j <= n; j++) {
                if (i==1 || i==n || j==1 || j==n) {
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
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        tilleRectangle(n);
        sc.close();
    }
}
