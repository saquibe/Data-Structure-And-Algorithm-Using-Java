import java.util.Scanner;

public class MulOfTwoNum {
    public static int mulOfTwoNum(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Multiplication of two number is : "+mulOfTwoNum(x, y));
        sc.close();
    }
}
