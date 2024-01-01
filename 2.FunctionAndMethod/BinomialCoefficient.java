import java.util.Scanner;

public class BinomialCoefficient {
    public static int calculateFact(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static int binCoff(int n, int r){
        int fact_n = calculateFact(n);
        int fact_r = calculateFact(r);
        int fact_nmr = calculateFact(n-r);
        int b_coff = fact_n/(fact_r*fact_nmr);
        return b_coff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial coefficient is : "+binCoff(n, r));
        sc.close();
    }
}
