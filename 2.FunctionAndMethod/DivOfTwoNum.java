import java.util.Scanner;

public class DivOfTwoNum {
    public static float divOfTwoNum(int a, int b){ //parameter of formal parameter
        float div = a/b;
        return div;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
         System.out.println("Division of tow number : "+divOfTwoNum(x, y)); //arguments or actual parameter
        sc.close();
    }
}
