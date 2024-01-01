public class OptimizePower {
    public static int optimizePower(int x, int n){
        if (n==0) {
            return 1;
        }
        int halfPower = optimizePower(x, n/2);
        int halfPowSqr = halfPower*halfPower;
        //power is odd
        if (n%2 != 0) {
            halfPowSqr = x*halfPowSqr;
        }
        return halfPowSqr;
    }
    public static void main(String[] args) {
        int x = 2, n = 6;
        System.out.println(optimizePower(x, n));
    }
}
//time complexity-->O(logn)