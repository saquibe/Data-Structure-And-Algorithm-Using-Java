// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int n){
        boolean isEven = false;
        if (n%2==0) {
            isEven = true;
        }else{
            isEven = false;
        }
        return isEven;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        System.out.println(n+" isEven? "+isEven(n));
        sc.close();
    }
}
