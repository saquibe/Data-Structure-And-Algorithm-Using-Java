//print number from 1 to n in acending order
public class PrintNumAcendingOrder{
    public static void printAcend(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        printAcend(n-1);
        System.out.print(" "+n+" ");
    }
    public static void main(String[] args) {
        int n = 30;
        printAcend(n);
    }
}