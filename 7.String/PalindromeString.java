public class PalindromeString {
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                //not a palindrome
                System.out.print("This is not a palindrome");
                return false;
            }
        }
        //palindrome
        System.out.println("This is a palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        isPalindrome(str);
    }
}