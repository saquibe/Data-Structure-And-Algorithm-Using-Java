public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 111010110, rem, sum = 0, mul = 1;
        while (n>0) {
            rem = n % 10;
            n /= 10;
            sum = rem * mul + sum;
            mul = mul*2;
        }
        System.out.println(sum);
    }
}
