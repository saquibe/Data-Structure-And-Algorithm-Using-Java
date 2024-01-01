import java.util.Scanner;

public class FormRectangle{
    public static boolean isFormRectangle(int a, int b, int c, int d){
        if((a==b && c==d) || (a==c && b==d) || (a==d && c==b)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(isFormRectangle(a, b, c, d));
        sc.close();
    }
}