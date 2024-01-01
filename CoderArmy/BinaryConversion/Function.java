import java.util.Scanner;
public class Function {
    //check prime or not
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    //count factorial
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;   
        }
        return fact;
    }

    //swap two numbers
    public static void swap(int a, int b){
        int temp = a;
               a = b;
               b = temp;
               System.out.println(a+" "+b+" ");
    }
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(isPrime(a));
        System.out.println(isPrime(b));

        System.out.println("Factorial of "+a+" is : "+factorial(a));
        System.out.println("Factorial of "+b+" is : "+factorial(b));

        swap(a, b);

        // System.out.println(isPrime(a+b));
        // System.out.println(factorial(a-b));
        sc.close();
    }
}
