public class TrailingZeroInFactorialNum {
    public static int trailingZero(int n){
        int count = 0;
        while (n>=5) {
            count += n/5;
            n /= 5;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(trailingZero(n));
    }
}
