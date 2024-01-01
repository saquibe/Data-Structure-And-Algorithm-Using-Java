//You are given a number (eg. 2019) convert it into string like english two (zero one nine)
//use recursive function to solve this problem
//the digit of the number will only be in range 0-9 and last digit of a number can't be 0 
public class NumberConvertIntoString {
    static String digits[] = {"one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number){
        if (number == 0) {
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        printDigits(1234);
    }
}
