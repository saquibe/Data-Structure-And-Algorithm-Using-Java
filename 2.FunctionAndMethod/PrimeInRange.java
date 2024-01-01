import java.util.Scanner;

public class PrimeInRange{
    public static boolean isPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) { //for optimized for(int i = 2; i<=Math.sqrt(n); i++ )
            if (n%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void primesRange(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to prime range : ");
        int n = sc.nextInt();
        primesRange(n);
        sc.close();
    }
}