// Write a Java method to compute the sum of the digits in an integer.
public class SumOfDigit{
    public static int chekSumIntger(int n){
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of digit is : "+chekSumIntger(789453783));
    }
}