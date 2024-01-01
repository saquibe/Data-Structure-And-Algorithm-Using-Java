import java.util.Scanner;

public class SumOfTwoNum {
    public static int sumTwo(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of two number is : "+sumTwo(x, y));
        sc.close();
    }
}
