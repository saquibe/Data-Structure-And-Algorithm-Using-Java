//using recursion
public class PrintNumDecendingOrder {
    public static void decendingOrder(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decendingOrder(n-1);
    }
    public static void main(String[] args) {
        int n = 20;
        decendingOrder(n);
    }
}
