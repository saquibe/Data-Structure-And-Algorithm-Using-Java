import java.util.Scanner;

public class ButterflyPattern {
    public static void butterflyPattern(int n){
        for (int i = 1; i <= n; i++) {
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //print stars
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //print stars
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        butterflyPattern(n);
        sc.close();
    }
}
