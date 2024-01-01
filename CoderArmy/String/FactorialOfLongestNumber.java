import java.util.ArrayList;

public class FactorialOfLongestNumber {
    public static String factorialLongest(int n){
        int ans[] = new int[2];
        while (n > 1) {
            int carry = 0, res;
            for (int i = 0; i < ans.length; i++) {
                res = ans[i]*n + carry;
                carry = res/10;
                ans[i] = res%10;
            }
            while (carry > 1) {
                
            }
        } 
    }
    public static void main(String[] args) {
        
    }
}
