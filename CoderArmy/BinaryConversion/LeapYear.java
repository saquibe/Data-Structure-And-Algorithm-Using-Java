import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        n = sc.nextInt();
        if (n%400==0) {
            System.out.println(n+" is LeapYear");
        }else if (n%4==0 && n%100==0) {
            System.out.println(n+" is not a LeapYear");
        }else{
            System.out.println(n+" is a LeapYear");
        }
        sc.close();
    }
}
