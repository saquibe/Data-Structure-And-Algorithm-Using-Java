// Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.Scanner;

public class PalindromeNum {
    public static void checkPalindrom(int n){
        int rem;
        int rev=0;
        int temp = n;
        while (n>0) {
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if (temp==rev) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        checkPalindrom(n);
        sc.close();
    }
}
