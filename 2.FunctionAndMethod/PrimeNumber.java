import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i < n-1; i++) { //for optimized for(int i = 2; i<=Math.sqrt(n); i++ )
            if (n%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
