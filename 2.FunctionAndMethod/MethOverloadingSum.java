import java.util.Scanner;

public class MethOverloadingSum {
    public static int sum(int a, int b){  //using different parameter
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of first two number : "+sum(a, b));
        System.out.println("Sum of three number : "+sum(a, b, c));
        sc.close();
    }
}
