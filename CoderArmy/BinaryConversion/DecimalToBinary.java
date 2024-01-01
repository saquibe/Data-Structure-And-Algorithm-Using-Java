public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 16, rem, sum = 0, mul = 1;
        while (n>0) {
            rem = n%2;
            n /= 2;
            sum = rem * mul + sum;
            mul = mul*10;
        }
        System.out.println(sum);        
    }
}
