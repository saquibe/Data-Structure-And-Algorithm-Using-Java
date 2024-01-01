//calculate nth fibonacci serise using recursion
public class FibonacciSeriese {
    public static int fib(int n){
        if (n==0 || n==1) { //base case
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fib(n-1)+fib(n-2);
        return fn;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}

//time complexity--> (2 pow n)
//space complexity --> O(n)