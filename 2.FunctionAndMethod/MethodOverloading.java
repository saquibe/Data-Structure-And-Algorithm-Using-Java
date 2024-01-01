// import java.util.Scanner;

import java.util.Scanner;

public class MethodOverloading {
        public static int max(int a, int b){
            return a>b?a:b;
        }
        public static float max(float x, float y){ //using different data types
            return x>y?x:y;
        }
        public static int max(int c, int d, int e){
            return c>d && c>e ? c:(d>e?d:e);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c =sc.nextInt();
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            
            System.out.println("Max of two integer : "+max(a, b));
            System.out.println("Max of two float : "+max(x, y));
            System.out.println("Max of three integer : "+max(a, b , c));
            sc.close();
    }
}
