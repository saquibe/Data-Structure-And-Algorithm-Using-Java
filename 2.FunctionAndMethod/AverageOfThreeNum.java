import java.util.Scanner;

public class AverageOfThreeNum {
    public static float avgOfThreeNum(int a, int b, int c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of three number is : "+avgOfThreeNum(a, b, c));
        sc.close();
    }
}
