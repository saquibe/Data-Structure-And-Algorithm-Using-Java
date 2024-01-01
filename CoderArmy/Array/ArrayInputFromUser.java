import java.util.Scanner;

public class ArrayInputFromUser {
    public static void main(String[] args) {
        // int arr[] = new int[10];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter element : ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        //     // System.out.print(arr[i]+" ");
        // }
        // for (int x : arr) {
        //     System.out.print(x+" ");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int inputArr[] = new int[size];
        System.out.println("Enter element of an Array : ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            inputArr[i] = sc.nextInt();
            sum = sum + inputArr[i];
        }
        System.out.println("Sum of an all element : "+sum);
    }
}
