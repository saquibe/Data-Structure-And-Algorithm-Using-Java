import java.util.Scanner;

public class FactorialOfNum {
    public static int calculateFact(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+" is : "+calculateFact(a));
        sc.close();
    }
}
