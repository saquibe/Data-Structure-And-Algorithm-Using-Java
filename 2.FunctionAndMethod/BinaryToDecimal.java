import java.util.Scanner;

public class BinaryToDecimal {
    public static void binToDecimal(int binNum){
        int pow = 0;
        int decimal = 0;
        while (binNum > 0) {
            int lastDigit = binNum  % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal number of is = "+decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int n = sc.nextInt();
        binToDecimal(n);
        sc.close();
    }
}
