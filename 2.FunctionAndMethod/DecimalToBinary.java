import java.util.Scanner;
public class DecimalToBinary{
    public static void decToBin(int dec){
        int pow = 0;
        int binNum = 0;
        int myNum = dec;
        while (dec>0) {
            int rem = dec % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec/2;
        }
        System.out.println("Binary form of "+myNum+" is = "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int n = sc.nextInt();
        decToBin(n);
        sc.close();
    }
}