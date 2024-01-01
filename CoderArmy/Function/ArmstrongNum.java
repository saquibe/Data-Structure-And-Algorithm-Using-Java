public class ArmstrongNum {
    public static boolean isArmStrong(int n, int digit ){
        int rem, ans = 0, temp = n;
        while (n != 0) {
            rem = n % 10;
            n /= 10;
            ans = ans + (int)Math.pow(rem, digit);
        }
        if (ans==temp) {
            return true;
        }else{
            return false;
        }
    }
    public static int countDigit(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 153;
        int digit = countDigit(n);
        System.out.println(isArmStrong(n, digit));
    }
}
